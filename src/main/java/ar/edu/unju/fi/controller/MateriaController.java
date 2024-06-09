package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoMateria;
import ar.edu.unju.fi.model.Materia;

@Controller
public class MateriaController {
	
	@Autowired
	 Materia nuevaMateria = new Materia();
	
	@GetMapping("/formularioMateria")
	public ModelAndView getFormMateria()
	{
		 ModelAndView modelView = new ModelAndView("formMateria");
		 modelView.addObject("nuevaMateria", new Materia());
		 return modelView;
	}
	
	@GetMapping("/ListaMaterias")
	public ModelAndView getlistaMateria() {
      ModelAndView modelView = new ModelAndView("listaDeMaterias");

      return modelView;
	}

	@PostMapping("/guardarMateria")
	public ModelAndView saveMateria(@ModelAttribute("nuevaMateria") Materia materiaParaGuardar) {
	
	 Materia materiaExt = ListadoMateria.buscarMateriaPorCodigo(materiaParaGuardar.getCodigo());
      if (materiaExt != null) {
          ListadoMateria.eliminarMateria(materiaParaGuardar.getCodigo());
      }
		
	ListadoMateria.agregarMateria(materiaParaGuardar);

	ModelAndView modelView = new ModelAndView("listaDeMaterias");
	modelView.addObject("listadoMateria", ListadoMateria.listarMateria());
	 
	 return modelView;
	
}


	@GetMapping("/quitarMateria/{codigo}")
	public ModelAndView deleteMateriaListado(@PathVariable(name="codigo") String codigo) {
		ListadoMateria.eliminarMateria(codigo);

		ModelAndView modelView = new ModelAndView("listaDeMaterias");
  		modelView.addObject("listadoMateria", ListadoMateria.listarMateria());

  		return modelView;
	}

	@GetMapping("/modificarMateria/{codigo}")
	public ModelAndView getModificarMateria(@PathVariable(name="codigo") String codigo) {
		Materia materiaParaModificar = ListadoMateria.buscarMateriaPorCodigo(codigo);

		ModelAndView modelView = new ModelAndView("formMateria");
		modelView.addObject("nuevaMateria", materiaParaModificar);

		return modelView;
	}



	@PostMapping("/modificarMateria")
	public ModelAndView updateMateria(@ModelAttribute("nuevaMateria") Materia materiaModificada) {
		ListadoMateria.modificarMateria(materiaModificada);

		ModelAndView modelView = new ModelAndView("listaDeMaterias");
		modelView.addObject("listadoMateria", ListadoMateria.listarMateria());

		return modelView;
	}
	
}
