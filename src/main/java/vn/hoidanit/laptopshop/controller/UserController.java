package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;


@Controller
public class UserController {

    // DI: dependency injection
    private final UserService userService;
   

    public UserController(UserService userService) {
        this.userService = userService;
       
    }
    
    @RequestMapping("/")
    public String getHomePage(Model model){
        List<User> arrUser = this.userService.getAllUsersByEmail("1@gmail.com");
        System.out.println(arrUser);
        return "hello";
    }
    @RequestMapping("/admin/user")
    public String getUserPage(Model model){
       List<User> users = this.userService.getAllUsers();
       model.addAttribute("user1", users);
        System.out.println(">>>check out users" + users);
        return "admin/user/table-users";
    }

    @RequestMapping("/admin/user/{id}")
    public String getUserDetailPage(Model model, @PathVariable long id){
        User user = this.userService.getUserById(id);
        User deleteUser = this.userService.deletUser(id);
        model.addAttribute("user", user);
        model.addAttribute("id",id);
        if(deleteUser == true){

        }
        return "admin/user/show";
    }




    




    @RequestMapping("/admin/user/create")
    public String getCreateUserPage(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }
    

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanit){ 
        this.userService.handleUserSave(hoidanit);
        return "redirect:/admin/user";
    }
}