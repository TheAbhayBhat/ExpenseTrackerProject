package com.expense.springboot.expenseTracker.Vo;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class detailsOfExpenseVO {
    String mainCategory;
    String subCategory;
    String desc;
    String amount;
}
