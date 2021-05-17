package mian.com.ssm6.chp5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void Test1(){
        String path="mian/com/ssm6/chp5/applicationContext.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(path);
        CustomerDao customerDao=(CustomerDao)app.getBean("customerDao");
        //返回值是Customer
        Customer customer=customerDao.findCustomerById(1);
        System.out.println(customer);
    }
}
