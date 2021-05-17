package mian.com.ssm3.chp2.myclass;

import mian.com.ssm3.chp2.interfaceweb.UserDao;
import mian.com.ssm3.chp2.interfaceweb.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")   //自动装配   <property name="userDao" ref="userDao"/>
    private UserDao userDao;
    @Override
    public void save() {
        this.userDao.save();
        System.out.println("...UserService...save");
    }
}
