package mian.com.ssm4.chp3.Test;

import mian.com.ssm4.chp3.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        String path="mian/com/ssm4/chp3/xml/app1.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(path);
        UserDao user=(UserDao) app.getBean("userDao");
        user.addUser();
    }
}
