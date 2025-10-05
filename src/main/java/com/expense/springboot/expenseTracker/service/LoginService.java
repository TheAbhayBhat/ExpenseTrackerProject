package com.expense.springboot.expenseTracker.service;

import com.expense.springboot.expenseTracker.Vo.loginVO;
import com.expense.springboot.expenseTracker.Vo.registerVO;
import org.springframework.stereotype.Component;

public interface LoginService {

    public Boolean login(loginVO loginVo);
    public void register(registerVO registerVo) throws Exception;


}
