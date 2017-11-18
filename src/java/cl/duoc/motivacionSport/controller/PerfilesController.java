
package cl.duoc.motivacionSport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/perfiles")
public class PerfilesController {
    
    @RequestMapping(method = RequestMethod.GET,value = "/listar.htm")
    public String inicio(Model model){       
        return "perfiles";
    }
    
}
