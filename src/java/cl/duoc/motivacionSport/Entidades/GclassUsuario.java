package cl.duoc.motivacionSport.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gclass_usuario")
public class GclassUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "name")
    private String name;
    @Size(max = 50)
    @Column(name = "user")
    private String user;
    @Size(max = 50)
    @Column(name = "password")
    private String password;
    @Size(max = 250)
    @Column(name = "direccion")
    private String direccion;    
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "comuna_id", referencedColumnName = "id")
    @ManyToOne
    private GclassComunas comunaId;
    @JoinColumn(name = "perfil_id", referencedColumnName = "id")
    @ManyToOne
    private GclassPerfil perfilId;    

    public GclassUsuario() {
    }

    public GclassUsuario(Integer id, String name, String user, String password, String direccion, String email, Date createAt, Date updateAt, Short active, GclassComunas comunaId, GclassPerfil perfilId) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.password = password;
        this.direccion = direccion;
        this.email = email;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.active = active;
        this.comunaId = comunaId;
        this.perfilId = perfilId;
    }
    
    public GclassUsuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public GclassComunas getComunaId() {
        return comunaId;
    }

    public void setComunaId(GclassComunas comunaId) {
        this.comunaId = comunaId;
    }

    public GclassPerfil getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(GclassPerfil perfilId) {
        this.perfilId = perfilId;
    }

    @Override
    public String toString() {
        return "GclassUsuario{" + "id=" + id + ", name=" + name + ", user=" + user + ", password=" + password + ", direccion=" + direccion + ", email=" + email + ", createAt=" + createAt + ", updateAt=" + updateAt + ", active=" + active + ", comunaId=" + comunaId + ", perfilId=" + perfilId + '}';
    }
}
