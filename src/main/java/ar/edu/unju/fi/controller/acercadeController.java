package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class acercadeController {

	@GetMapping("/acercade")
	
	public String acercaDe() {
		return "acercade";
	}
}
