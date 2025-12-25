package com.expense.springboot.expenseTracker.Vo;
import com.expense.springboot.expenseTracker.Vo.detailsOfExpenseVO;

import lombok.*;

import java.util.List;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class expenseVO {


 String userId;
 @Builder.Default
 String operation="addition";
 @Builder.Default
 String paymentMode="UPI";
 String creditOrDebit;
 detailsOfExpenseVO expenditureDetails;
 String dateOfExpense;
}
