package com.expense.springboot.expenseTracker.service;

import com.expense.springboot.expenseTracker.Vo.loginVO;
import org.springframework.stereotype.Component;

public interface LoginService {

    public Boolean login(loginVO loginVo);


}
