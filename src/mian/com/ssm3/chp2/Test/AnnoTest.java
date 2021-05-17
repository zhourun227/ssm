package mian.com.ssm3.chp2.Test;

import mian.com.ssm3.chp2.myclass.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoTest {
    public static void main(String[] args) {
        String path="mian/com/ssm3/chp2/xml/beans6.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(path);

        UserController c=(UserController)app.getBean("userController");
        c.save();
    }
}
