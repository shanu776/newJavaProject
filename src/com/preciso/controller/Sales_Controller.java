package com.preciso.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.preciso.bean.AddCustomerSalesBean;
import com.preciso.model.AddCustomerSales;
import com.preciso.model.Country;
import com.preciso.model.CustomerDepartment;
import com.preciso.model.CustomerLocation;
import com.preciso.model.State;
import com.preciso.service.AddCustomerSalesService;
import com.preciso.service.CSCService;

@Controller
public class Sales_Controller {	
	@Autowired
	private AddCustomerSalesService addCustomerSalesService;
	@Autowired
	private CSCService cscService;
	private Map<String, Object> model=new HashMap<String, Object>();
/*---------------------------------------------------------SaveCustomerData------------------------------------------------------------------*/
	
	@RequestMapping(value="/saveSalesCustomerData",method=RequestMethod.POST)
	public ModelAndView saveSalesCustomerData(@ModelAttribute("command") @Valid AddCustomerSalesBean addCustomerSalesBean,
			CustomerLocation location,CustomerDepartment department,BindingResult result,HttpServletRequest request)
	{
		
		Country cont=cscService.getCountry(Integer.parseInt(addCustomerSalesBean.getCountry()));
		State state=cscService.getState1(Integer.parseInt(addCustomerSalesBean.getState()));
		
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
		String customer=(String) session.getAttribute("customer");
		
		List<CustomerLocation> loc=new ArrayList<CustomerLocation>();
		List<CustomerDepartment> dep=new ArrayList<CustomerDepartment>();
		StringTokenizer st=new StringTokenizer(location.getLocation_name(), ",");
		StringTokenizer st1=new StringTokenizer(department.getDepartment_name(), ",");
		while (st.hasMoreElements()) {
			loc.add(new CustomerLocation(st.nextToken()));
		}		
		while (st1.hasMoreElements()) {
			dep.add(new CustomerDepartment(st1.nextToken()));
		}
		addCustomerSalesBean.setLocation(loc);
		addCustomerSalesBean.setDepartment(dep);
		addCustomerSalesBean.setCreated_by(name);
		addCustomerSalesBean.setCountry(cont.getName());
		addCustomerSalesBean.setState(state.getName());
		if(result.hasErrors())
		{
			if(name==null && customer==null)
				return new ModelAndView("redirect:login.html");
			if("admin".equals(name)){
				return new ModelAndView("addCustomerSalesAdmin");
			}
			return new ModelAndView("addCustomerSales");
		}
		
		AddCustomerSales addCustomerSales=prepareModel(addCustomerSalesBean);
		addCustomerSalesService.addCustomerSales(addCustomerSales);
		return new ModelAndView("redirect:/addSalesCustomerForm.html");		
	}
	
/*---------------------------------------------------------GoTo the Form------------------------------------------------------------------*/
	
	@RequestMapping(value="/addSalesCustomerForm",method=RequestMethod.GET)
	public ModelAndView addSalesCustomerForm(@ModelAttribute("customerSales") AddCustomerSalesBean addCustomerSalesBean,@ModelAttribute("location") CustomerLocation location,
			@ModelAttribute("department") CustomerDepartment department,HttpServletRequest request){
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
		String customer=(String) session.getAttribute("customer");
		model.put("country", cscService.getCountry());
		System.out.println(name+customer);
		if(name==null && customer==null)
			return new ModelAndView("redirect:login.html");
		if("admin".equals(name)){
			return new ModelAndView("addCustomerSalesAdmin",model);
		}
		return new ModelAndView("addCustomerSales",model);
	}

/*---------------------------------------------------------ViewCustomerData------------------------------------------------------------------*/
	
	@RequestMapping(value="/viewSalesCustomerData",method=RequestMethod.GET)
	public ModelAndView viewSalesCustomerData(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
		String customer=(String) session.getAttribute("customer");
		List<AddCustomerSales> list=addCustomerSalesService.listAddCustomerSales();
		for(AddCustomerSales acs:list)
		{
			
			List<CustomerDepartment> list2=addCustomerSalesService.listCustomerDepartment(acs);
			List<CustomerLocation> list1=addCustomerSalesService.listCustomerLocation(acs);
			/*System.out.println(list1);
			System.out.println(list2);*/
			acs.setLocation(list1);
			acs.setDepartment(list2);
		}
		
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("salesCustomer", prepareListOfBean(list));
		System.out.println(name+customer);
		if(name==null && customer==null)
			return new ModelAndView("redirect:login.html");
		if("admin".equals(name)){
			return new ModelAndView("viewCustomerSalesAdmin",model);
		}else
		return new ModelAndView("viewCustomerSales",model);
	}
	
/*---------------------------------------------------------UpdateCustomerData------------------------------------------------------------------*/	
	
	@RequestMapping(value="/updateSalesCustomerData",method=RequestMethod.GET)
	public ModelAndView updateSalesCustomerData(@ModelAttribute("customerSales") AddCustomerSalesBean addCustomerSalesBean,@ModelAttribute("location") CustomerLocation location,
			@ModelAttribute("department") CustomerDepartment department,BindingResult result)
	{
	    Map<String,Object> model=new HashMap<String,Object>();
	    AddCustomerSales list=addCustomerSalesService.getCustomerSalesData(addCustomerSalesBean.getId());
	    List<CustomerDepartment> list2=addCustomerSalesService.listCustomerDepartment(list);
		List<CustomerLocation> list1=addCustomerSalesService.listCustomerLocation(list);
		list.setLocation(list1);
		list.setDepartment(list2);
	    model.put("customerSales", prepareAddCustomerSalesBean(list));	    
		return new ModelAndView("addCustomerSales",model);		
	}

/*---------------------------------------------------------DeleteCustomerData------------------------------------------------------------------*/	
	
	@RequestMapping(value="/deleteSalsesCustomerData",method=RequestMethod.GET)
	public ModelAndView deleteSalseCustomerData(@ModelAttribute("command") AddCustomerSalesBean addCustomerSalesBean,BindingResult result,HttpServletRequest request)
	{	
		addCustomerSalesService.deleteCustomerSalesData(prepareModel(addCustomerSalesBean));
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("salesCustomers", null);
		return new ModelAndView("redirect:viewSalesCustomerData.html");
		
	}
/*---------------------------------------------------------ForSalesHomePage------------------------------------------------------------------*/	
	@RequestMapping("/salesDefault")
	public ModelAndView salesDefault()
	{
		return new ModelAndView("sales");
	}
	
/*------------------------------------------------------------CountryStateCity-----------------------------------------------------------------*/
	
	@RequestMapping(value="showState.html",method=RequestMethod.POST)
	public ModelAndView showState(@RequestParam("id") int id,HttpServletRequest request,HttpServletResponse response)
	{
		model.put("state", cscService.getState(id));
		return new ModelAndView("showState",model);
	}
	
	@RequestMapping(value="showCity.html",method=RequestMethod.POST)
	public ModelAndView showCity(@RequestParam("id") int id,HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println(id);
		model.put("city", cscService.getCity(id));
		return new ModelAndView("showCity",model);
	}
	
/*---------------------------------------------------------MethodsForBeanModeling------------------------------------------------------------------*/	
	
	private AddCustomerSalesBean prepareAddCustomerSalesBean(AddCustomerSales customerSalesData) {
		AddCustomerSalesBean bean=new AddCustomerSalesBean();
		bean.setId(customerSalesData.getId());
		bean.setName(customerSalesData.getName());
		bean.setEmail_id(customerSalesData.getEmail_id());
		bean.setContact_person(customerSalesData.getContact_person());
		bean.setShipping_address(customerSalesData.getShipping_address());
		bean.setBilling_address(customerSalesData.getBilling_address());
		bean.setAddress_line1(customerSalesData.getAddress_line1());
		bean.setAddress_line2(customerSalesData.getAddress_line2());
		bean.setCity(customerSalesData.getCity());
		bean.setState(customerSalesData.getState());
		bean.setCountry(customerSalesData.getCountry());
		bean.setAssigned_to(customerSalesData.getAssigned_to());
		bean.setPhone_no(customerSalesData.getPhone_no());
		bean.setContact_no(customerSalesData.getContact_no());
		bean.setZip_code(customerSalesData.getZip_code());
		bean.setVat_no(customerSalesData.getVat_no());
		bean.setCst_no(customerSalesData.getCst_no());
		bean.setShipping_method(customerSalesData.getShipping_method());
		bean.setPayment_terms(customerSalesData.getPayment_terms());
		bean.setCurrency(customerSalesData.getCurrency());
		bean.setCreated_by(customerSalesData.getCreated_by());	
		bean.setLocation(customerSalesData.getLocation());
		bean.setDepartment(customerSalesData.getDepartment());
		return bean;
	}
	
	private AddCustomerSales prepareModel(AddCustomerSalesBean addCustomerSalesBean) {
		AddCustomerSales addCustomerSales=new AddCustomerSales();
		addCustomerSales.setId(addCustomerSalesBean.getId());
		addCustomerSales.setName(addCustomerSalesBean.getName());
		addCustomerSales.setEmail_id(addCustomerSalesBean.getEmail_id());
		addCustomerSales.setContact_person(addCustomerSalesBean.getContact_person());
		addCustomerSales.setShipping_address(addCustomerSalesBean.getShipping_address());
		addCustomerSales.setBilling_address(addCustomerSalesBean.getBilling_address());
		addCustomerSales.setAddress_line1(addCustomerSalesBean.getAddress_line1());
		addCustomerSales.setAddress_line2(addCustomerSalesBean.getAddress_line2());
		addCustomerSales.setCity(addCustomerSalesBean.getCity());
		addCustomerSales.setState(addCustomerSalesBean.getState());
		addCustomerSales.setCountry(addCustomerSalesBean.getCountry());
		addCustomerSales.setAssigned_to(addCustomerSalesBean.getAssigned_to());
		addCustomerSales.setPhone_no(addCustomerSalesBean.getPhone_no());
		addCustomerSales.setContact_no(addCustomerSalesBean.getContact_no());
		addCustomerSales.setZip_code(addCustomerSalesBean.getZip_code());
		addCustomerSales.setVat_no(addCustomerSalesBean.getVat_no());
		addCustomerSales.setCst_no(addCustomerSalesBean.getCst_no());
		addCustomerSales.setShipping_method(addCustomerSalesBean.getShipping_method());
		addCustomerSales.setPayment_terms(addCustomerSalesBean.getPayment_terms());
		addCustomerSales.setCurrency(addCustomerSalesBean.getCurrency());
		addCustomerSales.setCreated_by(addCustomerSalesBean.getCreated_by());	
		addCustomerSales.setLocation(addCustomerSalesBean.getLocation());
		addCustomerSales.setDepartment(addCustomerSalesBean.getDepartment());
		addCustomerSalesBean.setId(null);		
		return addCustomerSales;
	}
	
	private List<AddCustomerSalesBean> prepareListOfBean(List<AddCustomerSales> addCustomerSales)
	{
	List<AddCustomerSalesBean>	beans=null;

	if(addCustomerSales!=null && !addCustomerSales.isEmpty())
	{
		beans=new ArrayList<AddCustomerSalesBean>();
		AddCustomerSalesBean bean=null;
		for(AddCustomerSales add:addCustomerSales)
		{
			bean=new AddCustomerSalesBean();
			bean.setId(add.getId());
			bean.setName(add.getName());
			bean.setEmail_id(add.getEmail_id());
			bean.setContact_person(add.getContact_person());
			bean.setShipping_address(add.getShipping_address());
			bean.setBilling_address(add.getBilling_address());
			bean.setAddress_line1(add.getAddress_line1());
			bean.setAddress_line2(add.getAddress_line2());
			bean.setCity(add.getCity());
			bean.setState(add.getState());
			bean.setCountry(add.getCountry());
			bean.setAssigned_to(add.getAssigned_to());
			bean.setPhone_no(add.getPhone_no());
			bean.setContact_no(add.getContact_no());
			bean.setZip_code(add.getZip_code());
			bean.setVat_no(add.getVat_no());
			bean.setCst_no(add.getCst_no());
			bean.setShipping_method(add.getShipping_method());
			bean.setPayment_terms(add.getPayment_terms());
			bean.setCurrency(add.getCurrency());
			bean.setCreated_by(add.getCreated_by());	
			bean.setLocation(add.getLocation());
			bean.setDepartment(add.getDepartment());
			beans.add(bean);
		}
	}
	return beans;
	}
	
	
}
