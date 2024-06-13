package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Materia {
	private String codigo;
	private String nombre;
	private String curso;
	private int horas;
	private String modalidad;
	private String docente;
	private String carrera;
	private Boolean estado;
	
}
