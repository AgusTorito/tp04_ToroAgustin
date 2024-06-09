package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoAlumno;
import ar.edu.unju.fi.model.Alumno;


@Controller
public class AlumnoController {
	
	 @Autowired
	 Alumno nuevoAlumno = new Alumno();
	
	@GetMapping("/formularioAlumno")
	public ModelAndView getFromAlumno()
	{
		//vista fromAlumno.html
		 ModelAndView modelView = new ModelAndView("fromAlumno");
		 //agrega el objeto
		 modelView.addObject("nuevoAlumno", new Alumno());
		 
		 return modelView;
	}
	
	 @GetMapping("/ListaAlumnos")
	    public ModelAndView getlistaAlumno() {
	        ModelAndView modeloVista = new ModelAndView("listaDeAlumno");

	        return modeloVista;
	    }
	
	@PostMapping("/guardarAlumno")
	public ModelAndView saveAlumno(@ModelAttribute("nuevoAlumno") Alumno alumnoGuardar) {
		
		 Alumno alumnoExt = ListadoAlumno.buscarAlumnoPorLibreta(alumnoGuardar.getLibreta());
	        if (alumnoExt != null) {
	            ListadoAlumno.eliminarAlumno(alumnoGuardar.getLibreta());
	        }
		
		//Guardar	
		ListadoAlumno.agregarAlumno(alumnoGuardar);
		
		//mostrar el listado
		ModelAndView modelView = new ModelAndView("listaDeAlumno");
		modelView.addObject("listadoAlumno", ListadoAlumno.listarAlumno());
		 
		 return modelView;
		
	}
	
	
	@GetMapping("/quitarAlumno/{libreta}")
    public ModelAndView deleteAlumnoListado(@PathVariable(name="libreta") String libreta) {
        ListadoAlumno.eliminarAlumno(libreta);

        ModelAndView modelView = new ModelAndView("listaDeAlumno");
        modelView.addObject("listadoAlumno", ListadoAlumno.listarAlumno());

        return modelView;
    }

    @GetMapping("/modificarAlumno/{libreta}")
    public ModelAndView getModificarAlumno(@PathVariable(name="libreta") String libreta) {
        Alumno alumnoParaModificar = ListadoAlumno.buscarAlumnoPorLibreta(libreta);

        ModelAndView modelView = new ModelAndView("fromAlumno");
        modelView.addObject("nuevoAlumno", alumnoParaModificar);

        return modelView;
    }
    
    

    @PostMapping("/modificarAlumno")
    public ModelAndView updateAlumno(@ModelAttribute("nuevoAlumno") Alumno alumnoModificado) {
        ListadoAlumno.modificarAlumno(alumnoModificado);

        ModelAndView modelView = new ModelAndView("listaDeAlumno");
        modelView.addObject("listadoAlumno", ListadoAlumno.listarAlumno());

        return modelView;
    }
	
}
