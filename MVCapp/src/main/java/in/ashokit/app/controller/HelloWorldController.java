package in.ashokit.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("hello", "message", "Hello and welcome to Springboot mvc");
        return modelAndView;
    }
}
