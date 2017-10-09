package com.practice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.service.AddService;

@Controller
public class AddController {
	
	
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res)
	//public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j)
	{
		  //int k = Integer.parseInt(req.getParameter("t1"))+Integer.parseInt(req.getParameter("t2"));
		AddService as = new AddService();
		  int k = as.add(Integer.parseInt(req.getParameter("t1")), Integer.parseInt(req.getParameter("t2")));
		//int k = i+j;
		//System.out.println( " ADDITION--"+k);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
		
	}
}
