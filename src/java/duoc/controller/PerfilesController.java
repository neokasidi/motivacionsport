
package duoc.controller;

import duoc.dao.PerfilDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/perfiles")
public class PerfilesController {
    
    @Autowired
    @Qualifier("PerfilDao")
    PerfilDao perfilDao;
    
    @RequestMapping(method = RequestMethod.GET,value = "/listar.htm")
    public String iwnicio(Model model){        
        model.addAttribute("perfiles", perfilDao.allEntries());        
        return "perfiles";
    }
    
    @RequestMapping(method = RequestMethod.GET,value ="/crear.htm")
    public String crear(Model model){
        return "perfiles_crear";
    }
    
}
