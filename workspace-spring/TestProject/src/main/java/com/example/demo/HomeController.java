package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "home")
	public ModelAndView home(Alien alien)
	{
		System.out.println("I am"+alien);
		ModelAndView mv= new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home.jsp");
		return mv;
		
		
	}

}
