package com.expense.springboot.expenseTracker.repository;

import com.expense.springboot.expenseTracker.Entity.userLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userLoginRepository extends JpaRepository<userLoginEntity,Integer> {


    Optional<userLoginEntity> findByUsernameAndPassword(String username,String password);
}
