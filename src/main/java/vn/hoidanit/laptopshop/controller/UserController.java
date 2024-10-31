package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;


@Controller
public class UserController {

    // DI: dependency injection
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/hoidanit")
    public String getHomePage(){
        return "eric.html";
    }
}


// @RestController
// public class UserController {
    
//     //DI: dependency injection
//     private UserService userService;

//     public UserController(UserService userService) {
//         this.userService = userService;
//     }


//     @GetMapping("")
//     public String getHomePage(){
//         return this.userService.handleHello();
//     }
// }
