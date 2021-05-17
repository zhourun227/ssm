package mian.com.ssm4.chp3.Test;

import mian.com.ssm4.chp3.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        String path="mian/com/ssm4/chp3/xml/app.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(path);
        UserDao userDao=(UserDao)app.getBean("userdaoproxy");
        userDao.addUser();
        userDao.deleteUser();
    }
}
