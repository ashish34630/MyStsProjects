package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "home")
	public String home()
	{
		System.out.println("i am able to print");
		return "home.jsp";
	}

}
