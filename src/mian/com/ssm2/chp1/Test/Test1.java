package mian.com.ssm2.chp1.Test;

import mian.com.ssm2.chp1.bean.Beans1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        String Path="mian/com/ssm2/chp1/xml/app.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(Path);
        Beans1 b1=(Beans1) app.getBean("bean1");
        System.out.println(b1.toString());
    }
}
