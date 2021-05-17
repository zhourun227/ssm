package mian.com.ssm2.chp1.Test;

import mian.com.ssm2.chp1.bean.Beans2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        String Path="mian/com/ssm2/chp1/xml/app.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(Path);

        Beans2 t2=(Beans2) app.getBean("bean2");
        System.out.println(t2.toString());
    }
}
