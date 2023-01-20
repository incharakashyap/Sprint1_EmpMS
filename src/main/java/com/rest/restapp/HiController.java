package com.rest.restapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HiController {
	
 @GetMapping("/api/helloapi")
  public String HiApi() {
	  return "Hello Sprint1";
  }
}