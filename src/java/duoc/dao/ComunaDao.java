/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.GclassComunas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class ComunaDao {
    
    @PersistenceContext
    private EntityManager em;
    
     public List<GclassComunas> getListadoComuna() {

        String jpql = "select u from GclassUsuario u order by u.name";
        return em.createQuery(jpql, GclassComunas.class).getResultList();
    }
    
}
