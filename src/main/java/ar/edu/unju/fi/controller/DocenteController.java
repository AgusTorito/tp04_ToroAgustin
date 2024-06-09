package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import ar.edu.unju.fi.collections.ListadoDocente;
import ar.edu.unju.fi.model.Docente;

@Controller
public class DocenteController {
	
	@Autowired
	 Docente nuevoDocente = new Docente();
	
	@GetMapping("/formularioDocente")
	public ModelAndView getFormDocente()
	{
		 ModelAndView modelView = new ModelAndView("formDocente");
		 modelView.addObject("nuevoDocente", new Docente());
		 return modelView;
	}
	
	@GetMapping("/ListaDocentes")
   public ModelAndView getlistaDocente() {
       ModelAndView modelView = new ModelAndView("listaDeDocentes");

       return modelView;
   }

	@PostMapping("/guardarDocente")
	public ModelAndView saveDocente(@ModelAttribute("nuevoDocente") Docente docenteParaGuardar) {
	
	 Docente docenteExt = ListadoDocente.buscarDocentePorLegajo(docenteParaGuardar.getLegajo());
       if (docenteExt != null) {
           ListadoDocente.eliminarDocente(docenteParaGuardar.getLegajo());
       }
		
	ListadoDocente.agregarDocente(docenteParaGuardar);

	ModelAndView modelView = new ModelAndView("listaDeDocentes");
	modelView.addObject("listadoDocente", ListadoDocente.listarDocente());
	 
	 return modelView;
	
}


	@GetMapping("/quitarDocente/{legajo}")
	public ModelAndView deleteDocenteListado(@PathVariable(name="legajo") String legajo) {
		ListadoDocente.eliminarDocente(legajo);

   	ModelAndView modelView = new ModelAndView("listaDeDocentes");
   	modelView.addObject("listadoDocente", ListadoDocente.listarDocente());

   	return modelView;
	}

	@GetMapping("/modificarDocente/{legajo}")
	public ModelAndView getModificarDocente(@PathVariable(name="legajo") String legajo) {
		Docente docenteParaModificar = ListadoDocente.buscarDocentePorLegajo(legajo);

		ModelAndView modelView = new ModelAndView("formDocente");
		modelView.addObject("nuevoDocente", docenteParaModificar);

		return modelView;
	}



	@PostMapping("/modificarDocente")
	public ModelAndView updateDocente(@ModelAttribute("nuevaDocente") Docente docenteModificado) {
		ListadoDocente.modificarDocente(docenteModificado);

		ModelAndView modelView = new ModelAndView("listaDeDocentes");
		modelView.addObject("listadoDocente", ListadoDocente.listarDocente());

		return modelView;
	}
	
	
}
