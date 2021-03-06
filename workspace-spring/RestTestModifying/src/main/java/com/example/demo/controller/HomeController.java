package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

import com.example.demo.Model.Alien;
import com.example.demo.dao.AlienRepo;

@RestController
public class HomeController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping(path = "index")
	public ModelAndView index()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}
	
	@PostMapping("alieng")
	public void  addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		
	}
	
	
	//These are ways of doing things in rest as view is directly reflected in the chrome page.
	//There is no use of going to Jsp
	@GetMapping("alieng")
	public List<Alien> findit()
	{
		List<Alien> alien=repo.findAll();
		return alien;
		
		
	}
	
	@RequestMapping("/findAlienRest/{aid}")
	public Optional<Alien> finditt(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);		
		
	}
	
	@DeleteMapping(path ="/findAlienRest/{aid}")
	public void delete(@PathVariable("aid")int aid)
	{
		
		repo.deleteById(aid);
	}
	
	
	
}
