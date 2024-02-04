package com.ty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeApp {
	@RequestMapping("/load")
	public ModelAndView loadme() {
	ModelAndView modelAndView=new ModelAndView("home.jsp");
	modelAndView.addObject("mywhish","go to hell");
	return modelAndView;
	}
	@RequestMapping("/load2")
	public ModelAndView  loadmesecond() {
		ModelAndView andView=new  ModelAndView("home.jsp");
		andView.addObject("ok","fine");
		
		return andView;
	}
	@RequestMapping("/student")
	public ModelAndView student() {
		ModelAndView modelAndView=new ModelAndView("home.jsp");
		Student student=new Student();
		student.setId(8);
		student.setName("raja");
		student.setEmail("raja@gmail.com");
		modelAndView.addObject("student",student);
		return modelAndView;
	
	}
	
	
	@RequestMapping("/savemeuser")
	public ModelAndView loadUser() {
		ModelAndView modelAndView=new ModelAndView("craete.jsp");
		modelAndView.addObject("user1",new User());
		return modelAndView;
	}
	
	
	@RequestMapping("/createuser")
	public ModelAndView saveUser(@ModelAttribute User user){
//		user.setId(5);
//		user.setName("ok");
//		user.setMail("ok@gmail.com");
		
		ModelAndView modelAndView=new ModelAndView("showuser.jsp");
		modelAndView.addObject("name",user.getName ());
		return modelAndView;
		
	}
	
	@RequestMapping("/ok1")
	public ModelAndView showAllUser() {
		User  user1=new User();
		user1.setId(2);
		user1.setName("roof");
		user1.setMail("root@gmail.com");
		
		
		User  user2=new User();
		user2.setId(2);
		user2.setName("roof");
		user2.setMail("root@gmail.com");
		
		
		User  user3=new User();
		user3.setId(2);
		user3.setName("roof");
		user3.setMail("root@gmail.com");
		
		List<User> users=new ArrayList();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		ModelAndView andView=new ModelAndView("see.jsp");

		andView.addObject("fine",users);
		return andView;
	}
	@RequestMapping("/edituser")
	public ModelAndView editUser(@RequestParam(name = "id") int id) {
		ModelAndView andView=new ModelAndView("edit.jsp");
		andView.addObject("id",id);
		return andView;
		
		
	}
	@RequestMapping("/deleteuser")
	public ModelAndView deleteUser(@RequestParam(name = "id") int id) {
		ModelAndView andView=new ModelAndView("delete.jsp");
		andView.addObject("id",id);
		return andView;
		
		
	}

}
