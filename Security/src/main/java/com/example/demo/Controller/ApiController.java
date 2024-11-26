package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApiController {
     @GetMapping("/home")
     public String home(){
         return "Welcome home...!";
     }
     @GetMapping("/student")

     public String student(){
         return  "Welcome boy...!";
     }
     @GetMapping("/admin")
     public String admin(){
         return "Welcome Boss...!";
     }
}
