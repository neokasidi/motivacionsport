package duoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/usuarios")
public class UsuariosController {   
    
    @RequestMapping(method = RequestMethod.GET,value = "/listar.htm")
    public String inicio(Model model){                
        return "usuarios";
    }
    
    @RequestMapping(method = RequestMethod.GET,value ="/crear.htm")
    public String crear(Model model){
        return "usuarios_crear";
    }
    
}
