package com.workshop.tradr.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import com.workshop.tradr.bean.UserRegistration;


public class RegistrationController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView UserRegistration(){
	      return new ModelAndView("registration", "command", new UserRegistration());
	   }
	   
	   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")
	   ModelMap model) {
		   RegistrationController.logger.info("Logged");
		    UserRegistration bean1= new UserRegistration();
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/trader","root","2004");  
				//here sonoo is database name, root is username and password  
				Statement stmt=con.createStatement();  
				
				
				ResultSet rs=stmt.executeQuery("");
				}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
					
	   
				//while(rs.next()) { 
				//System.out.println(rs.getString((5)));  
			//String name=rs.getString(5);
				//model.addAttribute("stockName", name);
				//}
				//model.addAttribute("stockName", list); 
			

	return "registration"; 	
		}

}   
		   
		   /*
	      model.addAttribute("name", student.getName());
	      model.addAttribute("age", student.getAge());
	      model.addAttribute("id", student.getId());
	      */
