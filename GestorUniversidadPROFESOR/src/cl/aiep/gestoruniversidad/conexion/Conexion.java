package cl.aiep.gestoruniversidad.conexion;
//package cl.aiep.pgtestconn1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {




		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try { 
			    Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException ex) {
			    System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
			}
			
			Connection connection = null;
			Statement st = null;
			// Database connect
			// Conectamos con la base de datos
			try {
				connection = DriverManager.getConnection(
				        "jdbc😛ostgresql😕/localhost:5432/DBU",
				        "postgres", "postgres");
				
				boolean valid = connection.isValid(50000);
	            System.out.println(valid ? "TEST OK" : "TEST FAIL");
	            st = connection.createStatement();
	            
	            ResultSet rs = st.executeQuery( ""
	                    + "SELECT \"rut\", \"Nombre\", \"edad\" "
	                    + "FROM pg.alumno;");
	            	System.out.println("Registros: " + rs.getFetchSize());
	            	while    ( 
	rs.next
	() ) {
	                    String rut= rs.getString("rut");
	                    String nombre= rs.getString("Nombre");
	                    int edad = rs.getInt("edad");
	           
	                    System.out.println( " RUT: " + rut );
	                    System.out.println( " NOMBRE: " + nombre );
	                    System.out.println( " EDAD: " + edad );
	                    System.out.println();
	                }
	                rs.close();
	                st.close();
	                connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

