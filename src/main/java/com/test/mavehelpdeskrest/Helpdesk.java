/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mavehelpdeskrest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "helpdesk")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Helpdesk.findAll", query = "SELECT h FROM Helpdesk h")
    , @NamedQuery(name = "Helpdesk.findById", query = "SELECT h FROM Helpdesk h WHERE h.id = :id")
    , @NamedQuery(name = "Helpdesk.findByFName", query = "SELECT h FROM Helpdesk h WHERE h.fName = :fName")
    , @NamedQuery(name = "Helpdesk.findByLName", query = "SELECT h FROM Helpdesk h WHERE h.lName = :lName")
    , @NamedQuery(name = "Helpdesk.findByEmail", query = "SELECT h FROM Helpdesk h WHERE h.email = :email")
    , @NamedQuery(name = "Helpdesk.findByComments", query = "SELECT h FROM Helpdesk h WHERE h.comments = :comments")})
public class Helpdesk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "FName")
    private String fName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "LName")
    private String lName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Недопустимый адрес электронной почты")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Comments")
    private String comments;
    @JoinColumn(name = "StatusID", referencedColumnName = "ID")
    @ManyToOne
    private Status statusID;
    @JoinColumn(name = "DepartmentID", referencedColumnName = "ID")
    @ManyToOne
    private Department departmentID;
    @JoinColumn(name = "EmployeeID", referencedColumnName = "ID")
    @ManyToOne
    private Employee employeeID;
    @JoinColumn(name = "SeverityID", referencedColumnName = "ID")
    @ManyToOne
    private Severity severityID;

    public Helpdesk() {
    }

    public Helpdesk(Integer id) {
        this.id = id;
    }

    public Helpdesk(Integer id, String fName, String lName, String email, String comments) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Status getStatusID() {
        return statusID;
    }

    public void setStatusID(Status statusID) {
        this.statusID = statusID;
    }

    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Department departmentID) {
        this.departmentID = departmentID;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    public Severity getSeverityID() {
        return severityID;
    }

    public void setSeverityID(Severity severityID) {
        this.severityID = severityID;
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
        if (!(object instanceof Helpdesk)) {
            return false;
        }
        Helpdesk other = (Helpdesk) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.mavehelpdeskrest.Helpdesk[ id=" + id + " ]";
    }
    
}
