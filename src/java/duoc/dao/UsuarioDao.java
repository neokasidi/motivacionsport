/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.GclassUsuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository("UsuarioDao")
public class UsuarioDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void agregar(GclassUsuario usuario) {
        em.persist(usuario);
    }

    @Transactional
    public void modificar(GclassUsuario usuario) {
        em.merge(usuario);
    }

    public List<GclassUsuario> getListadoUsuario() {

        String jpql = "select u from GclassUsuario u order by u.name";
        return em.createQuery(jpql, GclassUsuario.class).getResultList();
    }

}
