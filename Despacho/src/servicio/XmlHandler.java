package servicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import modelo.Orden;
import modelo.interfaces.Exportador;
import servicio.util.HandlerResponse;

public class XmlHandler implements Exportador {

    @Override
    public HandlerResponse exportar(Orden orden) {
        SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
        String fechaHoyString = SDF.format(new Date());
        String excelFilePath = ".\\ordenes_" + fechaHoyString + ".xls";

        try {
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(new File(excelFilePath));
            } catch (FileNotFoundException fnfe) {
                crearArchivo(excelFilePath);
            }
            inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);

            Sheet sheet = workbook.getSheetAt(0);

            Object[][] bookData = {
                {orden.getDireccion(), orden.getNombreCliente(), Arrays.toString(orden.getArticulos().toArray()), orden.getMontoTotal(),
                    SDF.format(orden.getFechaCompra())}
            };

            int rowCount = sheet.getLastRowNum();

            for (Object[] aBook : bookData) {
                Row row = sheet.createRow(++rowCount);

                int columnCount = 0;

                Cell cell = row.createCell(columnCount);
                cell.setCellValue(rowCount);

                for (Object field : aBook) {
                    cell = row.createCell(++columnCount);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }

            }

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            return new HandlerResponse("Orden de despacho generada correctamente", true);

        } catch (Exception ex) {
            ex.printStackTrace();
            return new HandlerResponse("Error al procesar orden, intente nuevamente", false);
        }
    }

    public void crearArchivo(String ruta) {
        HSSFWorkbook libro = new HSSFWorkbook();
        libro.createSheet();
        try {
            FileOutputStream elFichero = new FileOutputStream(ruta);
            libro.write(elFichero);
            elFichero.close();
            libro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            libro.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
