package com.lti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="HelloApp")
public class HelloRestController {
	//http://localhost:9091/HelloApp/hello--->used to access this below method which is GET
	@RequestMapping(path="hello", method=RequestMethod.GET) //mapps the requested url with the method
	//returns the json data 
	public String hello()
	{
		return "Hello from Rest Controller : get";
	}
	//http://localhost:9091/HelloApp/hello--->used to access this below method which is POST
	@RequestMapping(path="hello", method=RequestMethod.POST)
	//returns the json data 
	public String hello2()
	{
		return "Hello from Rest Controller : post";
	}
}
