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
	
	@GetMapping("/formularioAlumno")
	public ModelAndView getFromAlumno()
	{
		//vista fromAlumno.html
		 ModelAndView modelView = new ModelAndView("fromAlumno");
		 //agrega el objeto
		 modelView.addObject("nuevoAlumno", new Alumno());
		 
		 return modelView;
	}
	
}
