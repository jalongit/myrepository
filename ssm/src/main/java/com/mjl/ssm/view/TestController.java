package com.mjl.ssm.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/show")
	public String show(ModelMap map){
    	map.put("hello", "hello world");
		return "show";
	}
}
