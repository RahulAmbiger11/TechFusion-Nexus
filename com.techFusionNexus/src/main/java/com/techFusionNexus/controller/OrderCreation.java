package com.techFusionNexus.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.techFusionNexus.entities.Course;
import com.techFusionNexus.entities.Users;
import com.techFusionNexus.services.StudentService;
import com.techFusionNexus.services.TrainerService;
import com.techFusionNexus.services.UsersService;

@Controller
public class OrderCreation {
	
	@Autowired
	UsersService uservice;
	@Autowired
	StudentService sservice;
	@Autowired
	TrainerService tservice;
	
	@PostMapping("/takeOrder")
	@ResponseBody
	public String takeOrder(@RequestParam int amount,
			@RequestParam String email, @RequestParam int courseId) {	//modified
		mapCourseAndUser(email, courseId);	//modified
		Order order=null;
		try {
			  RazorpayClient razorpay=new RazorpayClient("rzp_test_Ww6wQ7JWgOYdwZ",
					  "ZB3lmxAxeEaGAqIZ8xHJLUKx");
			  JSONObject orderRequest = new JSONObject();
			  orderRequest.put("amount", amount*100); // amount in the smallest currency unit
			  orderRequest.put("currency", "INR");
			  orderRequest.put("receipt", "order_rcptid_11");

			  order = razorpay.orders.create(orderRequest);
			} catch (RazorpayException e) {
			  // Handle Exception
			  System.out.println(e.getMessage());
			}
		
		return order.toString();
	}
	
	public void mapCourseAndUser(String email, int courseId) {
		
		Users user=uservice.findUserByEmail(email);
		Course course=sservice.fetchCourse(courseId);
		
		user.getCourseList().add(course);
		course.getUserList().add(user);
		
		tservice.saveCourse(course);
		uservice.saveUsers(user);
		
	}
}
