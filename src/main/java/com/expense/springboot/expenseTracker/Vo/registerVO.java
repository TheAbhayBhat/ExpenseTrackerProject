package com.expense.springboot.expenseTracker.Vo;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class registerVO {

    private String firstName;
    private String lastName;
    private String income;
}
