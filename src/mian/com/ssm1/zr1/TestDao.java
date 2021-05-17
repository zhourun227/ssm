package mian.com.ssm1.zr1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    public static void main(String[] args) {
        String Path="mian/com/ssm1/zr1/app.xml";
        ApplicationContext a=new ClassPathXmlApplicationContext(Path);

        UserDao userDao=(UserDao) a.getBean("userDao");
        userDao.say();
    }
}
