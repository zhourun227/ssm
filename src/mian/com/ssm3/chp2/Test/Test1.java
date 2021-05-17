package mian.com.ssm3.chp2.Test;

import mian.com.ssm3.chp2.myclass.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        String path="mian/com/ssm3/chp2/xml/app.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(path);
        User user=(User)app.getBean("user");
        User user1=(User)app.getBean("user1");
        System.out.println(user);
        System.out.println(user1);
    }
}
