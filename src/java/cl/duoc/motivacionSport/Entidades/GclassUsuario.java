/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.motivacionSport.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samm
 */
@Entity
@Table(name = "gclass_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GclassUsuario.findAll", query = "SELECT g FROM GclassUsuario g"),
    @NamedQuery(name = "GclassUsuario.findById", query = "SELECT g FROM GclassUsuario g WHERE g.id = :id"),
    @NamedQuery(name = "GclassUsuario.findByName", query = "SELECT g FROM GclassUsuario g WHERE g.name = :name"),
    @NamedQuery(name = "GclassUsuario.findByUser", query = "SELECT g FROM GclassUsuario g WHERE g.user = :user"),
    @NamedQuery(name = "GclassUsuario.findByPassword", query = "SELECT g FROM GclassUsuario g WHERE g.password = :password"),
    @NamedQuery(name = "GclassUsuario.findByDireccion", query = "SELECT g FROM GclassUsuario g WHERE g.direccion = :direccion"),
    @NamedQuery(name = "GclassUsuario.findByEmail", query = "SELECT g FROM GclassUsuario g WHERE g.email = :email"),
    @NamedQuery(name = "GclassUsuario.findByCreateAt", query = "SELECT g FROM GclassUsuario g WHERE g.createAt = :createAt"),
    @NamedQuery(name = "GclassUsuario.findByUpdateAt", query = "SELECT g FROM GclassUsuario g WHERE g.updateAt = :updateAt"),
    @NamedQuery(name = "GclassUsuario.findByActive", query = "SELECT g FROM GclassUsuario g WHERE g.active = :active")})
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
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
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
    @OneToMany(mappedBy = "userId")
    private List<GclassUserClass> gclassUserClassList;

    public GclassUsuario() {
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

    @XmlTransient
    public List<GclassUserClass> getGclassUserClassList() {
        return gclassUserClassList;
    }

    public void setGclassUserClassList(List<GclassUserClass> gclassUserClassList) {
        this.gclassUserClassList = gclassUserClassList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GclassUsuario)) {
            return false;
        }
        GclassUsuario other = (GclassUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.duoc.motivacionSport.Entidades.GclassUsuario[ id=" + id + " ]";
    }
    
}
