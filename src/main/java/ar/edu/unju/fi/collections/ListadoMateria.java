package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;

public class ListadoMateria {
	public static List<Materia> materias = new ArrayList<Materia>();
	
	public static List<Materia> listarMateria() {
		return materias.stream().filter(materias -> materias.getEstado()).collect(Collectors.toList());
	}
	
	//Metodo para listar materias por codigo
	public static Materia buscarMateriaPorCodigo (String codigo)
	{
		for (Materia c : materias)
		{
			if(c.getCodigo().equals(codigo))
			{
				return c;
			}
		}
		return null;
	}
	
	//Metodo para agregar una materia

	public static void agregarMateria(Materia c)
	{
		c.setEstado(true);
		materias.add(c);
	}
	
	//Metodo para modificar una materia
	
	public static void modificarMateria(Materia materiaModificada)
	{
		for(int i=0; i<materias.size(); i++)
		{
			Materia materia = materias.get(i);
			if(materia.getCodigo().equals(materiaModificada.getCodigo())) {
				materias.set(i, materiaModificada);
				break;
			}
		}
	}

	//Metodo para eliminar una materia
	
	public static void eliminarMateria(String codigo)
	{
		materias.removeIf(materia -> materia.getCodigo().equals(codigo));
	}
}
