 package com.te.controllers;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.service.TraineeService;
import com.te.trainee.Trainee;

@Controller
public class ControllerClass {
	@Autowired
	private TraineeService service;
	@GetMapping("/login")
	public String getLoginPage() {
		return "loginpage";
	}
	@PostMapping("/result")
	public String getservice(ModelMap map, Trainee train) {
		if (service.addTrainee(train)) {
			map.addAttribute("text", "Sucessfully  Created Account");
			map.addAttribute("trainee", train);
		} else {
			map.addAttribute("text", "Unable To Create Account");
		}
		return "result";
	}
	@GetMapping("/fetchPage")
	public String getFetch() {
		return "fetch";
	}
	@PostMapping("/fetchData")
	public String getService2(ModelMap map, int id) {
		Trainee train = service.fetchData(id);
		map.addAttribute("text", "sucessfully  added data");
		map.addAttribute("trainee", train);
		return "fetchdata";
	}
	@GetMapping("/deletePage")
	public String getdelete() {
		return "delete";
	}
	@PostMapping("/deleteData")
	public String getService3(ModelMap map, int id,@SessionAttribute(name="userid",required=false)String session ) {
		if (service.deleteOperation(id)) {
			if(id==Integer.parseInt(session)) {
				map.addAttribute("msg", "your Account is deleted successfully");
			}else {
				map.addAttribute("msg", "Your are not allowed to Delete Other Customers Details ");
			}
			
		}
		return "deletePage";
	}
	@GetMapping("/facebook")
	public String getfacebookpage(ModelMap map, HttpServletResponse resp,HttpServletRequest request) {
		  Cookie cookie = new Cookie("userpwd1", request.getParameter("email"));
		  cookie.setMaxAge(60); 
		  resp.addCookie(cookie);
		return "fbloginpage";
	}
	@GetMapping("/fblogin")
	public String getFbService(ModelMap map, int id, String pwd,HttpSession session, HttpServletRequest request) {
		if (service.facebookddto(id, pwd)) {
			map.addAttribute("userid", id);
			map.addAttribute("msg", "Login sucessfull");
			session=request.getSession();	
			session.setAttribute("userid", id);
			return "password";
		} else {
			map.addAttribute("msg", "Login unsucessfull");
			return "password";
		}
	}
	@GetMapping("/upadte")
	public String getUpdatePage() {
		return "updatepage";
	}
	@PostMapping("/updatepage")
	public String getService3(ModelMap map, int id,String email,String pwd,String number,Trainee traine,@SessionAttribute(name="userid")String session) {
		if (id==Integer.parseInt(session)&&session!=null) {
			if(service.facebookupdate(id, pwd,email,number)) {
				map.addAttribute("text", "Sucessfully  Updated Your Account");
				map.addAttribute("trainee", traine);
			} else {
				map.addAttribute("text", "Unable To Update Account because invalid Credentials");
			}
			return "result";
		}
	else{
		return "error-page";	
		}	
	}	
	@GetMapping("/sample")
	public String sample() {
		return "Appolo";
	}
}