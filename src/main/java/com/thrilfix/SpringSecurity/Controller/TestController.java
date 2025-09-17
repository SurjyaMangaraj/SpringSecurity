package com.thrilfix.SpringSecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/signin")
    public String signin(){
        try{

        }catch (Exception e){
            System.out.println("Exception"+e);
        }
        return "login";
    }
}
