package ar.edu.unju.fi.model;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	private String fecNac;
	private String domicilio;
	private int LU;
	
	
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String dni, String nombre, String apellido, String email, int telefono, String fecNac,
			String domicilio, int lU) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fecNac = fecNac;
		this.domicilio = domicilio;
		LU = lU;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getFecNac() {
		return fecNac;
	}

	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getLU() {
		return LU;
	}

	public void setLU(int lU) {
		LU = lU;
	}
}
