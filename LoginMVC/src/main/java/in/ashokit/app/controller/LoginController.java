package in.ashokit.app.controller;


import in.ashokit.app.entity.User;
import in.ashokit.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @ModelAttribute
    public User getUser(){
        return new User();
    }

    @GetMapping(value = "/")
    public String returnIndexPage() {
        return "index";
    }

    @GetMapping(value = "/register")
    public String returnRegisterPage(Model model) {
       // User userObject = new User();
       // model.addAttribute("user",userObject);
        return "register";
    }

    @PostMapping(value = "/save")
    public String saveUser(@ModelAttribute("user") User user, Model model) {
        boolean flag = loginService.saveUser(user);
        if (flag == false) {
            model.addAttribute("message","User Already Exist");
            return "register";
        }
        else{
            return "success";
        }
    }


    @GetMapping(value = "/login")
    public String returnLoginPage(Model model) {
        //User userObj = new User();
       // model.addAttribute("userObj",userObj);
        return "login";

    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        User userFromService = loginService.loginUser(user);
        if (userFromService == null) {
            model.addAttribute("message","User Not Exist");
            return "login";
        }
        else{
            model.addAttribute("userName",userFromService.getUserName());
            return "welcome";
        }
    }



}
