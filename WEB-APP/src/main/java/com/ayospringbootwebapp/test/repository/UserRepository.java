package com.ayospringbootwebapp.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayospringbootwebapp.test.entitymodel.UserLogin;

@Repository
public interface UserRepository extends JpaRepository<UserLogin, String>{

}