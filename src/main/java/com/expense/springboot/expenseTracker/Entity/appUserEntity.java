package com.expense.springboot.expenseTracker.Entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;




@EqualsAndHashCode(callSuper = false)
@Data
@Getter
@Setter
@Entity
@Table(name="app_users")
@Builder(toBuilder = true)
@SQLRestriction("rowstate <> -1")
public class appUserEntity extends  baseEntity{

  @Id
  @GeneratedValue()
  @Column(name="user_id")
  private Integer id;

  @Column(name="first_name")
  private String FirstName;

  @Column(name="last_name")
  private String LastName;

  @Column(name="income")
  private String income;


}
