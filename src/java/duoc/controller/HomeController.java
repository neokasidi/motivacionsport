package duoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    
    @RequestMapping(value="/dashboard.htm",method = RequestMethod.GET)
    public String inicio(Model model){       
        return "home";
    }
    @RequestMapping(value="/dashboard.htm",method = RequestMethod.POST)
    public String inicioPass(Model model,@RequestParam("user") String usuario){       
        return "home";
    }
    
}
