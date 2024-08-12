package org.softuin.mobilele.web;


import org.softuin.mobilele.model.dto.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/users")
@Controller
public class UserRegistrationController {



    @GetMapping("/register")
    public String register(){

        return "auth-register";

    }


    @PostMapping("/register")
    public String register(UserRegistrationDTO userRegistrationDTO){

        return "redirect:/";
    }
}
