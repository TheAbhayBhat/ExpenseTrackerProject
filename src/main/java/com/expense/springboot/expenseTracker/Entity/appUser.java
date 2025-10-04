package com.expense.springboot.expenseTracker.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@Getter
@Setter
@Entity
@Table(name="AppUser")
public class appUser {

  @Id
  @GeneratedValue()
  @Column(name="id")
  private Integer id;

  @Column(name="firstname")
  private String FirstName;

  @Column(name="lastname")
  private String LastName;

  @Column(name="loggedDate")
  private Timestamp loggedDate;

  @Column(name="lastUpdatedDate")
  private Timestamp lastUpdatedDate;

}
