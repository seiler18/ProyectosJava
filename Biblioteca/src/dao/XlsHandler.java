package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import modelo.Articulo;
import modelo.HandlerResponse;
import modelo.Libro;
import modelo.Pelicula;
import modelo.Usuario;

public class XlsHandler {

	String excelFilePathArticulos = ".\\Particulos.xls";
	String excelFilePathUsuarios = ".\\Pusuarios.xls";

	public HandlerResponse guardarArticulos(List<Articulo> lista) {

		HSSFWorkbook libro = new HSSFWorkbook();
		HSSFSheet hoja = libro.createSheet();
		int tipoArticulo = -1;
		int valorCeldaCuatro = 0;
		String valorCeldaCinco = "";
		HSSFCell celda = null;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getClass().equals(Libro.class)) {
				tipoArticulo = 0;
				valorCeldaCuatro = ((Libro) lista.get(i)).getPaginas();
				valorCeldaCinco = ((Libro) lista.get(i)).getImprenta();
			} else {
				tipoArticulo = 1;
				valorCeldaCuatro = ((Pelicula) lista.get(i)).getDuracion();
				valorCeldaCinco = ((Pelicula) lista.get(i)).getCalidad();
			}

			HSSFRow fila = hoja.createRow(i);
			
			celda = fila.createCell((short) 0);			
			celda.setCellValue(tipoArticulo);
			celda = fila.createCell((short) 1);
			celda.setCellValue(lista.get(i).getPlaxoMaximo());
			celda = fila.createCell((short) 2);
			celda.setCellValue(lista.get(i).getNombre());
			celda = fila.createCell((short) 3);
			celda.setCellValue(lista.get(i).getCodigo());
			celda = fila.createCell((short) 4);
			celda.setCellValue(valorCeldaCuatro);
			celda = fila.createCell((short) 5);
			celda.setCellValue(valorCeldaCinco);
			celda = fila.createCell((short) 6);
			celda.setCellValue(lista.get(i).isReservado());
		}

		// Exportamos el archivo
		try {
			FileOutputStream elFichero = new FileOutputStream(excelFilePathArticulos);
			libro.write(elFichero);
			elFichero.close();
			libro.close();
			return new HandlerResponse("Peticion finalizada", true);
		} catch (Exception e) {
		}
		try {
			libro.close();
		} catch (Exception e) {
		}
		return new HandlerResponse("No pudimos realizar su peticion, intente nuevamente mas tarde", false);
	}

	public List<Articulo> leerArticulos() {
		Workbook workbook = null;
		FileInputStream inputStream = null;
		List<Articulo> lista = new ArrayList<>();
		try {
			inputStream = new FileInputStream(new File(excelFilePathArticulos));
			workbook = WorkbookFactory.create(inputStream);

			Sheet sheet = workbook.getSheetAt(0);
			Row row;

			int cantidadFilas = sheet.getPhysicalNumberOfRows();

			
			Articulo articulo = null;
			for (int r = 0; r < cantidadFilas; r++) {
				row = sheet.getRow(r);
				if (row != null && null != row.getCell(0)) {
					if (row.getCell(0).getNumericCellValue() == 0) {
						articulo = new Libro(
								(int) row.getCell(1).getNumericCellValue(),
								row.getCell(2).getStringCellValue(), 
								row.getCell(3).getStringCellValue(),
								(int) row.getCell(4).getNumericCellValue(), 
								row.getCell(5).getStringCellValue(),
								row.getCell(6).getBooleanCellValue());
					} else {
						articulo = new Pelicula((int) row.getCell(1).getNumericCellValue(),
								row.getCell(2).getStringCellValue(), row.getCell(3).getStringCellValue(),
								(int) row.getCell(4).getNumericCellValue(), row.getCell(5).getStringCellValue(),
								row.getCell(6).getBooleanCellValue());
					}
					lista.add(articulo);
				}else {
					break;
				}
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
			return new ArrayList<Articulo>();
		}
		try {
			workbook.close();
		} catch (Exception e) {
		}
		try {
			inputStream.close();
		} catch (Exception e) {
		}
		return lista;
	}
	
	public List<Usuario> leerUsuarios() {
		Workbook workbook = null;
		FileInputStream inputStream = null;
		List<Usuario> lista = new ArrayList<>();
		try {
			inputStream = new FileInputStream(new File(excelFilePathUsuarios));
			workbook = WorkbookFactory.create(inputStream);

			Sheet sheet = workbook.getSheetAt(0);
			Row row;

			int cantidadFilas = sheet.getPhysicalNumberOfRows();

			// Leer filas completas
			Usuario user = null;
			for (int r = 0; r < cantidadFilas; r++) {
				row = sheet.getRow(r);
				if (row != null) {
					
					user = new Usuario(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
					
					lista.add(user);
				}
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
			return new ArrayList<Usuario>();
		}
		try {
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			inputStream.close();
		} catch (Exception e) {
		}
		return lista;
	}
}
