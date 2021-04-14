package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Alien;
import com.example.demo.dao.AlienRepo;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("index")
	public String index()
	{
		System.out.println("I am here");
		return "index.jsp";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("deleteAlien")
	public ModelAndView delete(@RequestParam int id)
	{
		System.out.println("hello there");
		ModelAndView mv= new ModelAndView();
		Alien alien=repo.findById(id).orElse(new Alien());
		System.out.println(alien);
		mv.setViewName("show.jsp");
		mv.addObject(alien);
		repo.deleteById(id);
		return mv;
		
		
	}
	
	@RequestMapping("findAlien")
	public ModelAndView find()
	{
		ModelAndView mv= new ModelAndView();
		String alien=repo.findAll().toString();
		mv.setViewName("find.jsp");
		mv.addObject(alien);
		System.out.println(alien);
		return mv;
		
		
	}
	//These are ways of doing things in rest as view is directly reflected in the chrome page.
	//There is no use of going to Jsp
	@ResponseBody
	@RequestMapping("findAllAlienRest")
	public String findit()
	{
		String alien=repo.findAll().toString();
		return alien;
		
		
	}
	@ResponseBody
	@RequestMapping("/findAlienRest/{aid}")
	public String finditt(@PathVariable("aid")int aid)
	{
		String alien=repo.findById(aid).toString();
		return alien;
		
		
	}
	
	
	
	
	
	
}
