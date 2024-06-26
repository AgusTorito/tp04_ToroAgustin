package ar.edu.unju.fi.collections;

import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unju.fi.model.Carrera;
import java.util.ArrayList;



public class ListadoCarreras {
	
	public static List<Carrera> carreras = new ArrayList<Carrera>();
	
	public static List<Carrera> listarCarrera() {
		 return carreras.stream().filter(carreras -> carreras.getEstado()).collect(Collectors.toList());
	}
	
	
	//Metodo para listar carreras por ID
	public static Carrera buscarCarreraPorCodigo (String codigo)
	{
		for (Carrera c : carreras)
		{
			if(c.getCodigo().equals(codigo))
			{
				return c;
			}
		}
		return null;
	}
	
	//Metodo para agregar una carrear

	public static void agregarCarrera(Carrera c)
	{
		c.setEstado(true);
		carreras.add(c);
	}
	
	//Metodo para modificar una carrera
	
	public static void modificarCarrera(Carrera carreraModificada)
	{
		for(int i=0; i<carreras.size(); i++)
		{
			Carrera carrera = carreras.get(i);
			if(carrera.getCodigo().equals(carreraModificada.getCodigo())) {
				carreras.set(i, carreraModificada);
				break;
			}
		}
	}

	//Metodo para eliminar una carrera
	
	public static void eliminarCarrera(String codigo)
	{
		carreras.removeIf(carrera -> carrera.getCodigo().equals(codigo));
	}
	
}

