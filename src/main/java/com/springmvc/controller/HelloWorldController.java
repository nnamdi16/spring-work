package com.springmvc.controller;

import com.springmvc.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {
  
  @GetMapping("/")
  public String handler(Model model) {
    System.out.println("am here");
    return "helloWorld";
  }
}
