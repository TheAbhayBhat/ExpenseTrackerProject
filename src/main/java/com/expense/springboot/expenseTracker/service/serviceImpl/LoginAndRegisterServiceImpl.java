package com.expense.springboot.expenseTracker.service.serviceImpl;

import com.expense.springboot.expenseTracker.Entity.appUserEntity;
import com.expense.springboot.expenseTracker.Entity.userLoginEntity;
import com.expense.springboot.expenseTracker.Vo.loginVO;
import com.expense.springboot.expenseTracker.Vo.registerVO;
import com.expense.springboot.expenseTracker.repository.appUserRepository;
import com.expense.springboot.expenseTracker.repository.userLoginRepository;
import com.expense.springboot.expenseTracker.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LoginAndRegisterServiceImpl implements LoginService {

    @Autowired
    userLoginRepository userloginRepository;
    @Autowired
    appUserRepository appuserRepository;

    @Override
    public Boolean login(loginVO loginVo)
    {
        //username password match and return yes or no (in future return JWT token)
        Optional<userLoginEntity> User=userloginRepository.findByUsernameAndPassword(loginVo.getUserName(),loginVo.getPassWord());
        if(User.isPresent()) return Boolean.TRUE;
        return Boolean.FALSE;
    }

    @Override
    public void register(registerVO registerVo) throws Exception
    {
        appUserEntity registerUser= appUserEntity.builder()
                                                 .FirstName(registerVo.getFirstName())
                                                 .LastName(registerVo.getLastName())
                                                 .income(registerVo.getIncome())
                                                 .build();
        appuserRepository.save(registerUser);

    }


}
