package com.expense.springboot.expenseTracker.apis;

import com.expense.springboot.expenseTracker.service.serviceImpl.expenseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import  com.expense.springboot.expenseTracker.Vo.expenseVO;


@Slf4j
@Controller
@RequestMapping("/main")
public class mainController {

    @Autowired
    expenseServiceImpl expenseserviceImpl;

    @GetMapping("/addExpense")
    private ResponseEntity<Object> addExpense(@RequestBody expenseVO expensevo){
        try{
               // call service to add expense
            expenseserviceImpl.addExpense(expensevo);

            return ResponseEntity.ok().body("success");
        } catch (Exception e) {
           log.error("exception in addExpense");
        }
        return ResponseEntity.internalServerError().build();
    }

}
