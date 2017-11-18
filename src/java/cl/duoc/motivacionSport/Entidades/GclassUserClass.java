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


@Entity
@Table(name = "gclass_user_class")
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

    public GclassUserClass(Integer id, Date createAt, Date updateAt, Short active, GclassClass classId, GclassUsuario userId) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.active = active;
        this.classId = classId;
        this.userId = userId;
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
    public String toString() {
        return "GclassUserClass{" + "id=" + id + ", createAt=" + createAt + ", updateAt=" + updateAt + ", active=" + active + ", classId=" + classId + ", userId=" + userId + '}';
    }        
}
