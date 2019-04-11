/*package com.ayospringbootwebapp.test.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayospringbootwebapp.test.entitymodel.UserLogin;
import com.ayospringbootwebapp.test.entitymodel.UserAuditLog;
import com.ayospringbootwebapp.test.repository.UserRepository;
import com.ayospringbootwebapp.test.repository.UserAuditRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserAuditRepository userAuditRepository;
    
    public UserLogin getUserById(String Id) {
        return userRepository.getOne(Id);
    }
   
    public void addUserAuditEntry(String userid, String auditDetail) {
    	UUID uuid = UUID.randomUUID();
        UserAuditLog newAudit = new UserAuditLog();
        newAudit.setId(uuid.toString());
        newAudit.setUserId(userid);
        newAudit.setAuditDetail(auditDetail);
        newAudit.setAuditDate(new Date());
        userAuditRepository.save(newAudit);
    }
}*/