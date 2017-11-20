/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.motivacionSport.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samm
 */
@Entity
@Table(name = "gclass_perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GclassPerfil.findAll", query = "SELECT g FROM GclassPerfil g"),
    @NamedQuery(name = "GclassPerfil.findById", query = "SELECT g FROM GclassPerfil g WHERE g.id = :id"),
    @NamedQuery(name = "GclassPerfil.findByName", query = "SELECT g FROM GclassPerfil g WHERE g.name = :name"),
    @NamedQuery(name = "GclassPerfil.findByCreateAt", query = "SELECT g FROM GclassPerfil g WHERE g.createAt = :createAt"),
    @NamedQuery(name = "GclassPerfil.findByUpdateAt", query = "SELECT g FROM GclassPerfil g WHERE g.updateAt = :updateAt"),
    @NamedQuery(name = "GclassPerfil.findByActive", query = "SELECT g FROM GclassPerfil g WHERE g.active = :active")})
public class GclassPerfil implements Serializable {

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
    private int active;

    public GclassPerfil() {
    }

    public GclassPerfil(String name) {
        this.name = name;
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

    public int getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

}
