/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.entidades;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samm
 */
@Entity
@Table(name = "gclass_user_class")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GclassUserClass.findAll", query = "SELECT g FROM GclassUserClass g"),
    @NamedQuery(name = "GclassUserClass.findById", query = "SELECT g FROM GclassUserClass g WHERE g.id = :id"),
    @NamedQuery(name = "GclassUserClass.findByCreateAt", query = "SELECT g FROM GclassUserClass g WHERE g.createAt = :createAt"),
    @NamedQuery(name = "GclassUserClass.findByUpdateAt", query = "SELECT g FROM GclassUserClass g WHERE g.updateAt = :updateAt"),
    @NamedQuery(name = "GclassUserClass.findByActive", query = "SELECT g FROM GclassUserClass g WHERE g.active = :active")})
public class GclassUserClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "active")
    private Short active;
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    @ManyToOne
    private GclassClass classId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    private GclassUsuario userId;

    public GclassUserClass() {
    }

    public GclassUserClass(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public GclassClass getClassId() {
        return classId;
    }

    public void setClassId(GclassClass classId) {
        this.classId = classId;
    }

    public GclassUsuario getUserId() {
        return userId;
    }

    public void setUserId(GclassUsuario userId) {
        this.userId = userId;
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
        if (!(object instanceof GclassUserClass)) {
            return false;
        }
        GclassUserClass other = (GclassUserClass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.duoc.motivacionSport.Entidades.GclassUserClass[ id=" + id + " ]";
    }
    
}
