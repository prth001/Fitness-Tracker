package com.jsoftwares.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsoftwares.model.Exercise;

@Controller
@RequestMapping(value="/minutes")
public class MinuteController {

	@RequestMapping(value="/add")
	public String add(@ModelAttribute("exercise") Exercise exercise, Model model)
	{
		System.out.println("Exercise: " + exercise.getMinutes());
		model.addAttribute("title", "Add minutes exercised");
		return "minutes/add";
	}
}
