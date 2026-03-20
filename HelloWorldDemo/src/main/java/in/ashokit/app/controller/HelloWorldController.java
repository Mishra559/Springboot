package in.ashokit.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public ModelAndView helloProducer() {
        ModelAndView modelAndView = new ModelAndView("hello","message","Hello And Welcome To SpringBoot");
        return modelAndView;
    }
}
