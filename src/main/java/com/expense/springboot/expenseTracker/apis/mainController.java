package com.expense.springboot.expenseTracker.apis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/main")
public class mainController {

    @GetMapping("/addExpense")
    private ResponseEntity<Object> addExpense(){
        try{
               // call service to add expense

            return ResponseEntity.ok().body("success");
        } catch (Exception e) {
           log.error("exception in addExpense");
        }
        return ResponseEntity.internalServerError().build();
    }

}
