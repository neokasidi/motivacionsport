/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.GclassClass;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository("ClassDao")
public class ClassDao {
    
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public void agregar(GclassClass clase) {
        em.persist(clase);
    }

    @Transactional
    public void modificar(GclassClass clase) {
        em.merge(clase);
    }

    public List<GclassClass> getListadoClase() {

        String jpql = "select u from GclassUsuario u order by u.name";
        return em.createQuery(jpql, GclassClass.class).getResultList();
    }
    
}
