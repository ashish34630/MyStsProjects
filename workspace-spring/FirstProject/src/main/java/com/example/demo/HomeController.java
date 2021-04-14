package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	
	public String home()
	{
		System.out.println("I am here");
		return "home.jsp";
	}

}
