package com.expense.springboot.expenseTracker.service.serviceImpl;

import com.expense.springboot.expenseTracker.Entity.appUser;
import com.expense.springboot.expenseTracker.Vo.loginVO;
import com.expense.springboot.expenseTracker.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public Boolean login(loginVO loginVo)
    {
        //username password match and return yes or no (in future return JWT token)
        Optional<appUser> User;

        return Boolean.FALSE;

    }

}
