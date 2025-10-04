package com.expense.springboot.expenseTracker.apis;

import com.expense.springboot.expenseTracker.service.serviceImpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.expense.springboot.expenseTracker.Vo.loginVO;

@RequestMapping("/login")
@RestController
public class loginController {
    @Autowired
    LoginServiceImpl loginServiceImpl;

    @PostMapping("/loginSubmit")
    private void loginSubmit(@RequestBody loginVO loginVo)
    {
        try{
            // call login service
            loginServiceImpl.login(loginVo);

        }catch(Exception e)
        {
            System.out.println("exception");
        }

    }

}
