package com.ayospringbootwebapp.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayospringbootwebapp.test.entitymodel.UserAuditLog;

@Repository
public interface UserAuditRepository extends JpaRepository<UserAuditLog, String>{

}