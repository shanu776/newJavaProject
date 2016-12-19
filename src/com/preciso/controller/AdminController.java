package com.preciso.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.apache.jasper.tagplugins.jstl.core.Url;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.preciso.model.Company;
import com.preciso.model.Department;
import com.preciso.model.Location;
import com.preciso.model.Product;
import com.preciso.model.Services;
import com.preciso.model.User;
import com.preciso.service.AddCompanyService;
import com.preciso.service.AddDepartmentService;
import com.preciso.service.AddLocationService;
import com.preciso.service.ProductService;
import com.preciso.service.ServicesService;
import com.preciso.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private AddCompanyService addCompanyService;
	@Autowired
	private AddDepartmentService addDepartmentService;
	@Autowired
	private AddLocationService addLocationService;
	@Autowired
	private UserService userService;	
	@Autowired	
	private ProductService productService;
	@Autowired
	private ServicesService servicesService;
	
	private List<Company> list;
	Map<String, Object> model=new HashMap<String, Object>();
	
	
	@RequestMapping("/adminDefault")
	public ModelAndView adminDefault()
	{
		Map<String, Object> model=new HashMap<>();
		model.put("company", addCompanyService.listAddCompany());
		return new ModelAndView("admin",model);
	}
	
/*-----------------------------------------------------------------Company---------------------------------------------------------------------*/
	
	@RequestMapping(value="/createCompany")
	public ModelAndView createCompany(@ModelAttribute("company") Company company,@ModelAttribute("department") Department department,
			@ModelAttribute("location") Location location)
	{
		Map<String, Object> model=new HashMap<String,Object>();		
		//model.put("company", addCompanyService.getCompanyData(company.getId()));
		model.put("location", addLocationService.listAddLocation());
		model.put("department", addDepartmentService.listAddDepartment());
		return new ModelAndView("addCompany",model);		
	}
	
	@RequestMapping(value="/saveCompany", method=RequestMethod.POST)
	public ModelAndView saveCompany(Company company,@RequestParam("file") MultipartFile file)
	{
		try {
			Blob blob=Hibernate.createBlob(file.getInputStream());
			company.setLogo(blob);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		addCompanyService.addCompany(company);
		return new ModelAndView("redirect:login.html");
	}
	
	@RequestMapping(value="/saveDepartment")
	public ModelAndView saveDepartment(Department department)
	{
		addDepartmentService.addDepartment(department);
		return new ModelAndView("redirect:createCompany.html");
	}
	
	@RequestMapping(value="/saveLocation")
	public ModelAndView saveLocation(Location location)
	{
		addLocationService.addLocation(location);
		return new ModelAndView("redirect:createCompany.html");
	}
	
	@RequestMapping(value="/deleteDepartment")
	public ModelAndView deleteDepartment(Department department)
	{
		addDepartmentService.deleteDepartmentData(department);
		return new ModelAndView("redirect:createCompany.html");
	}
	
	@RequestMapping(value="/deleteLocation")
	public ModelAndView deleteLocation(Location addLocation)
	{
		addLocationService.deleteLocationData(addLocation);
		return new ModelAndView("redirect:createCompany.html");
	}
	
	@RequestMapping("/deleteCompany")
	public ModelAndView deleteCompany(Company company,HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		session.invalidate();
		addCompanyService.deleteCompanyData(company);
		return new ModelAndView("redirect:createCompany.html");	
	}
	@RequestMapping("/updateCompany")
	public ModelAndView updateCompany(@ModelAttribute("company") Company company,@ModelAttribute("department") Department department,
			@ModelAttribute("location") Location location)
	{
		Map<String, Object> model=new HashMap<String, Object>();
		model.put("company", addCompanyService.getCompanyData(company.getId()));
		model.put("location", addLocationService.listAddLocation());
		model.put("department", addDepartmentService.listAddDepartment());
		return new ModelAndView("addCompany",model);
		
	}
	
/*----------------------------------------------------------------User-------------------------------------------------------------------*/
	
	@RequestMapping(value="userForm")
	public ModelAndView userForm(@ModelAttribute("user") User user)
	{
		list=addCompanyService.listAddCompany();	
		Map<String, Object> model=new HashMap<String,Object>();
		model.put("company", list);	
		model.put("department", addDepartmentService.listAddDepartment());
		return new ModelAndView("addUser",model);
		
	}
	
	@RequestMapping(value="saveUser", method=RequestMethod.POST)
	public ModelAndView saveUser(User user,@RequestParam("photo1") MultipartFile photo,@RequestParam("cv1") MultipartFile cv,HttpServletRequest request)
	{
		try {
			Blob blob=Hibernate.createBlob(photo.getInputStream());
			Blob blob1=Hibernate.createBlob(cv.getInputStream());
			user.setPhoto(blob);
			user.setCv(blob1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userService.addUser(user);
		return new ModelAndView("redirect:userForm.html");
		
	}
	
	@RequestMapping(value="viewUser")
	public ModelAndView viewUser(HttpServletResponse response,User user,HttpServletRequest request)
	{
		int i=0;
		Map<String, Object> model=new HashMap<String,Object>();
		List<User> list1=userService.listUser();
		FileOutputStream fout;
		for(User l:list1)
		{
			try {
				InputStream b=l.getPhoto().getBinaryStream();
				String absoluteFilesystemPath = request.getServletContext().getRealPath("/");
				System.out.println(absoluteFilesystemPath);
				fout=new FileOutputStream(absoluteFilesystemPath+"//image//abc"+(i++)+".jpg");
				IOUtils.copy(b, fout);
				System.out.println(i);
				}
				catch (SQLException | IOException e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		model.put("user", list1);
		model.put("company", list);
		return new ModelAndView("viewUser",model);
	}
	
	@RequestMapping(value="deleteUser")
	public ModelAndView deleteUser(User user)
	{
		userService.deleteUserData(user);
		return new ModelAndView("redirect:viewUser.html");
		
	}
	
	@RequestMapping(value="updateUser")
	public ModelAndView updateUser(@ModelAttribute("user") User user)
	{
		Map<String, Object> model=new HashMap<String,Object>();
		model.put("users", userService.getUserData(user.getId()));
		model.put("company", list);
		model.put("department", addDepartmentService.listAddDepartment());
		return new ModelAndView("addUser",model);		
	}
	
/*----------------------------------------------------------------Product----------------------------------------------------------------*/
	
	@RequestMapping("productForm")
	public ModelAndView productForm(@ModelAttribute("product") Product product)
	{
		return new ModelAndView("addProduct");
	}
	
	@RequestMapping(value="saveProduct",method=RequestMethod.POST)
	public ModelAndView saveProduct(Product product)
	{
		productService.addProduct(product);
		return new ModelAndView("redirect:productForm.html");
	}
	
	@RequestMapping(value="viewProduct")
	public ModelAndView viewProduct()
	{
		Map<String, Object> model=new HashMap<String, Object>();
		model.put("products", productService.listProduct());
		return new ModelAndView("viewProduct",model);
	}
	
	@RequestMapping(value="updateProduct")
	public ModelAndView updateProduct(Product product)
	{
		Map<String, Object> model=new HashMap<String, Object>();
		model.put("product", productService.getProductData(product.getProduct_id()));
		return new ModelAndView("addProduct",model);
	}
	
	@RequestMapping(value="deleteProduct")
	public ModelAndView deleteProduct(Product product)
	{
		productService.deleteProductData(product);
		return new ModelAndView("redirect:viewProduct.html");		
	}
	
/*----------------------------------------------------------------Services-----------------------------------------------------------------*/
	@RequestMapping(value="serviceForm")
	public ModelAndView serviceForm(@ModelAttribute("services") Services services)
	{
		return new ModelAndView("addServices");
	}
	
	@RequestMapping(value="saveServices",method=RequestMethod.POST)
	public ModelAndView saveServices(Services services)
	{
		servicesService.addServices(services);
		return new ModelAndView("redirect:serviceForm.html");
	}
	@RequestMapping(value="viewServices")
	public ModelAndView viewServices()
	{
		Map<String, Object> model=new HashMap<>();
		model.put("services", servicesService.listServices());
		return new ModelAndView("viewServices",model);
	}
	@RequestMapping(value="updateServices")
	public ModelAndView updateServices(Services services)
	{
		Map<String, Object> model=new HashMap<>();
		model.put("service", servicesService.getServicesData(services.getService_id()));
		return new ModelAndView("addServices",model);
	}
	@RequestMapping(value="deleteServices")
	public ModelAndView deleteServices(Services services)
	{
		servicesService.deleteServicesData(services);
		return new ModelAndView("redirect:viewServices.html");
	}

}