
package cl.duoc.motivacionSport.Controller;

import cl.duoc.motivacionSport.Dao.PerfilDao;
import cl.duoc.motivacionSport.Entidades.GclassPerfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/perfiles")
public class PerfilesController {
    
    @Autowired
    @Qualifier("PerfilDao")
    PerfilDao perfilDao;
    
    @RequestMapping(method = RequestMethod.GET,value = "/listar.htm")
    public String inicio(Model model){        
        model.addAttribute("perfiles", perfilDao.allEntries());
        model.addAttribute("perfile", new GclassPerfil());
        return "perfiles";
    }
    
    @RequestMapping(method = RequestMethod.POST,value ="/crear.htm")
    public String crear(@ModelAttribute("perfile") GclassPerfil perfil){                
        perfilDao.agregar(perfil);
        return "perfiles";
    }
    
}
