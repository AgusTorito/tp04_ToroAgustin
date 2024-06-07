package ar.edu.unju.fi.model;

public class Carrera {
	private String codigo;
	private String nombre;
	private int años;
	private String estado;
	
	public Carrera(String codigo, String nombre, int años, String estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.años = años;
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
			
}
