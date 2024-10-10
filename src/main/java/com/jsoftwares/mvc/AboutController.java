package com.jsoftwares.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/about")
public class AboutController {

	@RequestMapping(value = "/the-team")
	public String theTeam(Model model) {
		model.addAttribute("title", "The Team");
		return "about/the-team";
	}

	@RequestMapping(value = "/mission")
	public String mission(Model model) 
	{
		model.addAttribute("title", "Mission");
		return "about/mission";
	}
	
	@RequestMapping(value="/vision")
	public String vision(Model model)
	{
		model.addAttribute("title", "Vision");
		return "about/vision";
	}
}
