package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.Alumno;
import java.util.List;
import java.util.ArrayList;

public class ListadoAlumno {
	
	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	
	//Metodo para listar Alumnos por dni
	public static Alumno buscarAlumnoPorDni (int dni)
	{
		for (Alumno c : alumnos)
		{
			if(c.getDni().equals(dni))
			{
				return c;
			}
		}
		return null;
	}
	
	//Metodo para agregar un alumno

	public static void agregarAlumno(Alumno c)
	{
		alumnos.add(c);
	}
	
	//Metodo para modificar un alumno
	
	public static void modificarAlumno(Alumno alumnoModificado)
	{
		for(int i=0; i<alumnos.size(); i++)
		{
			Alumno alumno = alumnos.get(i);
			if(alumno.getDni().equals(alumnoModificado.getDni())) {
				alumnos.set(i, alumnoModificado);
				break;
			}
		}
	}

	//Metodo para eliminar un alumno
	
	public static void eliminarAlumno(String dni)
	{
		alumnos.removeIf(alumno -> alumno.getDni().equals(dni));
	}
}
