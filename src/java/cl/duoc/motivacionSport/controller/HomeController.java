package cl.duoc.motivacionSport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
    
    @RequestMapping(value="/dashboard.htm",method = RequestMethod.GET)
    public String inicio(Model model){       
        return "home";
    }
    
}
