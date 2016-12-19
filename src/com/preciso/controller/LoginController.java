package com.preciso.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.preciso.model.Company;
import com.preciso.service.AddCompanyService;

@Controller
public class LoginController {

@Autowired
private AddCompanyService addCompanyService;

private List<Company> list;
HttpSession session;


	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request)
	{
		list=addCompanyService.listAddCompany();		
		if(list.isEmpty())
			return new ModelAndView("redirect:createCompany.html");		
		return new ModelAndView("login");
		
	}
	
	
	@RequestMapping("/loginAction")
	public ModelAndView loginAction(HttpServletRequest request,HttpServletResponse response)
	{
		String name=request.getParameter("name");
		session=request.getSession();		
		if(name.equals("admin")){
			session.setAttribute("name", name);	
			Map<String, Object> model=new HashMap<String,Object>();
			model.put("company", list);								
			return new ModelAndView("admin",model);
			}
			else {
				session.setAttribute("customer", "customer");
				return new ModelAndView("sales","message","welcme"+name );
			}
	}
	
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request)
	{
		session=request.getSession();
		String name=(String)session.getAttribute("name");
		String customer=(String)session.getAttribute("customer");
		System.out.println(name+customer);
		
		if(name!=null || customer!=null){
			session.invalidate();
		}
			
		return new ModelAndView("redirect:login.html");
	}
			
}
