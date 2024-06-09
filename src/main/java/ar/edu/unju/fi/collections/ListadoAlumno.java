package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.Alumno;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ListadoAlumno {
	
	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	
	
	//Metodo para listar alumnos
	
	 public static List<Alumno> listarAlumno() {
		 return alumnos.stream().filter(alumnos -> alumnos.getEstado()).collect(Collectors.toList());
	}
	
	//Metodo para listar Alumnos por dni
	public static Alumno buscarAlumnoPorLibreta (String libreta)
	{
		for (Alumno c : alumnos)
		{
			if(c.getLibreta().equals(libreta))
			{
				return c;
			}
		}
		return null;
	}
	
	//Metodo para agregar un alumno

	public static void agregarAlumno(Alumno c)
	{
		//agregando el estado
		c.setEstado(true);
		alumnos.add(c);
	}
	
	//Metodo para modificar un alumno
	
	public static void modificarAlumno(Alumno alumnoModificado)
	{
		for(int i=0; i<alumnos.size(); i++)
		{
			Alumno alumno = alumnos.get(i);
			if(alumno.getLibreta().equals(alumnoModificado.getLibreta())) {
				alumnos.set(i, alumnoModificado);
				break;
			}
		}
	}
	
	

	//Metodo para eliminar un alumno
	
	public static void eliminarAlumno(String libreta)
	{
		alumnos.removeIf(alumno -> alumno.getLibreta().equals(libreta));
	}
}
