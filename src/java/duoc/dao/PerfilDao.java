package duoc.dao;

import duoc.entidades.GclassPerfil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository("PerfilDao")
public class PerfilDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void agregar(GclassPerfil perfil) {
        em.persist(perfil);
    }

    public GclassPerfil findById(int id) {
        return em.find(GclassPerfil.class, id);
    }

    public List<GclassPerfil> allEntries() {
        String jpql = "select p from GclassPerfil p";
        return em.createQuery(jpql, GclassPerfil.class).getResultList();
    }
}