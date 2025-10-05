package com.expense.springboot.expenseTracker.repository;

import com.expense.springboot.expenseTracker.Entity.appUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface appUserRepository extends JpaRepository<appUserEntity,Integer> {
}
