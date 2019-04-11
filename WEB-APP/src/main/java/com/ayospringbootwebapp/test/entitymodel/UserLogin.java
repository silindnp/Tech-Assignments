/*package com.ayospringbootwebapp.test.entitymodel; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
public class UserLogin {

    private String Id;
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String emailId;
 
    public UserLogin() {
  
    }
 
    public UserLogin(String Id, String userId, String password) {
         this.Id = Id;
         this.userId = userId;
         this.password = password;
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

     @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
 
    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @Column(name = "email_address", nullable = true)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User [UserId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId 
       + "]";
    }
 
}*/