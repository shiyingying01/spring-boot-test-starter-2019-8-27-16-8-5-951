package com.oocl.web.sampleWebApp;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
    
    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String badRequest() {
        return "Hello World";
    }
    
    @RequestMapping("/user")
    public @ResponseBody HashMap<String, String> user() {
    	HashMap<String, String> map = new HashMap<>();
    	map.put("user", "name");
        return map;
    }
    
    @RequestMapping("/users")
    public @ResponseBody HashMap<String, String> users() {
    	HashMap<String, String> map = new HashMap<>();
    	map.put("id", "001");
        return map;
    }
}