package com.house.houseweb.controller;




import com.house.housecommon.model.User;
import com.house.houseweb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class HelloController {
  private Logger logger= LoggerFactory.getLogger(HelloController.class);

  @Autowired
  private UserService userService;
  
  @RequestMapping("hello")
  public String  hello(ModelMap modelMap){
    try {
      List<User> users = userService.getUsers();
      User user = users.get(2);
      modelMap.put("user", user);
    } catch (Exception e) {
      logger.error("message",e.getMessage());
    }
    return "hello";
  }
  
  @RequestMapping("index")
  public String index(){
     return "homepage/index";
  }

}
