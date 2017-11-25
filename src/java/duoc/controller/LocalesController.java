/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author samm
 */
@Controller
@RequestMapping("/locales")
public class LocalesController {
    
    @RequestMapping(method = RequestMethod.GET,value = "/listar.htm")
    public String inicio(Model model){                
        return "locales";
    }
    
    @RequestMapping(method = RequestMethod.GET,value ="/crear.htm")
    public String crear(Model model){
        return "locales_crear";
    }    
}
