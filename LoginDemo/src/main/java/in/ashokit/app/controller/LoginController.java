package in.ashokit.app.controller;


import in.ashokit.app.LoginDemoApplication;
import in.ashokit.app.entity.LoginCredentials;
import in.ashokit.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService service;


    @GetMapping(value = "/login")
    public String getLoginPage(){
        return "login";
    }


    @PostMapping(value = "/login")
    public String verifyLogin(@RequestParam("username") String username, @RequestParam("password") String password , Model model){
        LoginCredentials loginCredentials = service.fetchCredentials(username, password);
        if(loginCredentials!=null){
            model.addAttribute("message","Welcome to spring boot " + username);
            return "success";
        }
        else{
            model.addAttribute("message","Invalid username or password");
            return "login";
        }


    }

}
