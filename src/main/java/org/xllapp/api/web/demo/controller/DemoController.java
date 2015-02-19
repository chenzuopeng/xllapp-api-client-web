package org.xllapp.api.web.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *
 * @author dylan.chen Nov 19, 2014
 * 
 */
@Controller
public class DemoController {

	@RequestMapping("/demo")
	public String demo(HttpServletRequest request, HttpServletResponse response){
		return "demo/demo";
	}
	
}
