package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Docente;

public class ListadoDocente {
		
public static List<Docente> docentes = new ArrayList<Docente>();
	
	//Metodo para listar docentes por legajo
	public static Docente buscarDocentePorLegajo (String legajo)
	{
		for (Docente c : docentes)
		{
			if(c.getLegajo().equals(legajo))
			{
				return c;
			}
		}
		return null;
	}
	
	//Metodo para agregar un Docente

	public static void agregarDocente(Docente c)
	{
		docentes.add(c);
	}
	
	//Metodo para modificar un Docente
	
	public static void modificarDocente(Docente docenteModificado)
	{
		for(int i=0; i<docentes.size(); i++)
		{
			Docente docente = docentes.get(i);
			if(docente.getLegajo().equals(docenteModificado.getLegajo())) {
				docentes.set(i, docenteModificado);
				break;
			}
		}
	}

	//Metodo para eliminar un Docente
	
	public static void eliminarDocente(String legajo)
	{
		docentes.removeIf(docente -> docente.getLegajo().equals(legajo));
	}
}
