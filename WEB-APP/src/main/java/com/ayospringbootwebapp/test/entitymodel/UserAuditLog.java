/*package com.ayospringbootwebapp.test.entitymodel; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_audit_log")
public class UserAuditLog {

    private String Id;
    private String userId;
    private String auditDetail;
    private Date auditDate;
 
    public UserAuditLog() {
  
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public String getId() {
        return Id;
    }
    public void setId(String id) {
        this.Id = id;
    }

     @Column(name = "user_id", nullable = false)
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

     @Column(name = "audit_detail", nullable = false)
    public String getAuditDetail() {
        return auditDetail;
    }
    public void setAuditDetail(String auditDetail) {
        this.auditDetail = auditDetail;
    }
 
    @Column(name = "audit_date", nullable = false)
    public Date getAuditDate() {
        return auditDate;
    }
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }
 
    @Override
    public String toString() {
        return "User [UserId=" + userId + ", Audit detail= (" + auditDetail + "), Audit_Date=" + auditDate
       + "]";
    }
 
}*/