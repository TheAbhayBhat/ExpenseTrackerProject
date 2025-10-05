package com.expense.springboot.expenseTracker.Entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import java.sql.Timestamp;

@Data
@Getter
@Setter
@Entity
@Table(name="AppUser")
@Builder(toBuilder = true)
@Where(clause="rowstate <> -1")
public class appUserEntity {

  @Id
  @GeneratedValue()
  @Column(name="id")
  private Integer id;

  @Column(name="firstname")
  private String FirstName;

  @Column(name="lastname")
  private String LastName;

  @Column(name="income")
  private String income;

  @Column(name="loggedDate")
  private Timestamp loggedDate;

  @Column(name="lastUpdatedDate")
  private Timestamp lastUpdatedDate;

}
