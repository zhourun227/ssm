package mian.com.ssm2.chp1.Test;

import mian.com.ssm2.chp1.bean.Beans3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        String Path="mian/com/ssm2/chp1/xml/app.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(Path);

        Beans3 b3=(Beans3) app.getBean("bean3");
        System.out.println(b3.toString());
    }
}
