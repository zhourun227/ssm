package mian.com.ssm3.chp2.myclass;

import mian.com.ssm3.chp2.interfaceweb.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;
    public void save(){
        this.userService.save();
        System.out.println("..UserController...save");
    }
}
