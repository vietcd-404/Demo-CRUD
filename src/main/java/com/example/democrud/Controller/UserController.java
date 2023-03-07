package com.example.democrud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

   @GetMapping("")
    public String showGHome(){
       return "index";
   }
}
