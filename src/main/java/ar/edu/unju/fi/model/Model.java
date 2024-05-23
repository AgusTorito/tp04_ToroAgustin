package ar.edu.unju.fi.model;

public class Model {
	public class Materia{
		private int codigo;
		private String nombre;
		private String curso;
		private int horas;
		private String modalidad;
		private String docente;
		private String carrera;
		
		public Materia(int codigo, String nombre, String curso, int horas, String modalidad, String docente,
				String carrera) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.curso = curso;
			this.horas = horas;
			this.modalidad = modalidad;
			this.docente = docente;
			this.carrera = carrera;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public int getHoras() {
			return horas;
		}

		public void setHoras(int horas) {
			this.horas = horas;
		}

		public String getModalidad() {
			return modalidad;
		}

		public void setModalidad(String modalidad) {
			this.modalidad = modalidad;
		}

		public String getDocente() {
			return docente;
		}

		public void setDocente(String docente) {
			this.docente = docente;
		}

		public String getCarrera() {
			return carrera;
		}

		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}
		
		
	}
	
	public class Docente{
		private int legajo;
		private String nombre;
		private String apellido;
		private String email;
		private int telefono;
		
		public Docente(int legajo, String nombre, String apellido, String email, int telefono) {
			super();
			this.legajo = legajo;
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
			this.telefono = telefono;
		}

		public int getLegajo() {
			return legajo;
		}

		public void setLegajo(int legajo) {
			this.legajo = legajo;
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
						
	}
	
	public class Alumno {
		private int dni;
		private String nombre;
		private String apellido;
		private String email;
		private int telefono;
		private String fecNac;
		private String domicilio;
		private int LU;
		
		public Alumno(int dni, String nombre, String apellido, String email, int telefono, String fecNac,
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

		public int getDni() {
			return dni;
		}

		public void setDni(int dni) {
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
	
	public class Carrera {
		private int codigo;
		private String nombre;
		private int años;
		private String estado;
		
		public Carrera(int codigo, String nombre, int años, String estado) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.años = años;
			this.estado = estado;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
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
}
