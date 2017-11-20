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
@Table(name = "gclass_region")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GclassRegion.findAll", query = "SELECT g FROM GclassRegion g"),
    @NamedQuery(name = "GclassRegion.findById", query = "SELECT g FROM GclassRegion g WHERE g.id = :id"),
    @NamedQuery(name = "GclassRegion.findByName", query = "SELECT g FROM GclassRegion g WHERE g.name = :name"),
    @NamedQuery(name = "GclassRegion.findByCreateAt", query = "SELECT g FROM GclassRegion g WHERE g.createAt = :createAt"),
    @NamedQuery(name = "GclassRegion.findByUpdateAt", query = "SELECT g FROM GclassRegion g WHERE g.updateAt = :updateAt"),
    @NamedQuery(name = "GclassRegion.findByActive", query = "SELECT g FROM GclassRegion g WHERE g.active = :active")})
public class GclassRegion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 250)
    @Column(name = "name")
    private String name;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Column(name = "active")
    private Short active;
    @OneToMany(mappedBy = "regionId")
    private List<GclassComunas> gclassComunasList;

    public GclassRegion() {
    }

    public GclassRegion(Integer id) {
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

    @XmlTransient
    public List<GclassComunas> getGclassComunasList() {
        return gclassComunasList;
    }

    public void setGclassComunasList(List<GclassComunas> gclassComunasList) {
        this.gclassComunasList = gclassComunasList;
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
        if (!(object instanceof GclassRegion)) {
            return false;
        }
        GclassRegion other = (GclassRegion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.duoc.motivacionSport.Entidades.GclassRegion[ id=" + id + " ]";
    }
    
}
