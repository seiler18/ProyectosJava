package archivos.clases;

public class Alumno {
	 private int idAlumno;
	 private String nombre;
	 private String licenciatura;
	 public int getIdAlumno() {
	 return idAlumno;
	 }
	 public void setIdAlumno(int idAlumno) {
	 this.idAlumno = idAlumno;
	 }
	 public String getNombre() {
	 return nombre;
	 }
	 public void setNombre(String nombre) {
	 this.nombre = nombre;
	 }
	 public String getLicenciatura() {
	 return licenciatura;
	 }
	 public void setLicenciatura(String licenciatura) {
	 this.licenciatura = licenciatura;
	 }
	 public String toString() {
	 String mensaje = "";
	 mensaje = this.idAlumno + "," + this.nombre + "," +
	this.licenciatura;
	 return mensaje;
	 }
	}