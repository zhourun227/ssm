package mian.com.ssm1.zr1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    public static void main(String[] args) {
        String Path="mian/com/ssm1/zr1/app.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(Path);
        UserService userService=(UserService) app.getBean("UserService");
        userService.say();
    }
}
