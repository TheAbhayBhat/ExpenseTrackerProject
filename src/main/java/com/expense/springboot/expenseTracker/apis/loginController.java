package com.expense.springboot.expenseTracker.apis;

import com.expense.springboot.expenseTracker.Vo.registerVO;
import com.expense.springboot.expenseTracker.service.serviceImpl.LoginAndRegisterServiceImpl;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.expense.springboot.expenseTracker.Vo.loginVO;

@RequestMapping("/login")
@RestController
public class loginController {
    @Autowired
    LoginAndRegisterServiceImpl loginAndRegisterServiceImpl;

    @GetMapping("/loginSubmit")
    private ResponseEntity<Object> loginSubmit(@RequestBody loginVO loginVo)
    {
        try{
            Boolean isUserExist=loginAndRegisterServiceImpl.login(loginVo);
            return ResponseEntity.ok(isUserExist);
        }catch(Exception e)
        {
            System.out.println("exception"+ e);
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/loginRegister")
    private ResponseEntity<Object> loginRegister(@RequestBody registerVO registerVo)
    {
          try{
              loginAndRegisterServiceImpl.register(registerVo);
              return ResponseEntity.ok("Success");
          }catch(Exception e)
          {
              System.out.println("erri");
          }
        return ResponseEntity.notFound().build();
    }

}
