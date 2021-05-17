package mian.com.ssm2.chp1.Test;

import mian.com.ssm2.chp1.scope.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        String Path="mian/com/ssm2/chp1/xml/app1.xml";
        ApplicationContext app=new ClassPathXmlApplicationContext(Path);
        Scope s1=(Scope) app.getBean("scope");
        Scope s2=(Scope) app.getBean("scope");
        System.out.println(s1==s2);

        String Path1="mian/com/ssm2/chp1/xml/app1.xml";
        ApplicationContext app1=new ClassPathXmlApplicationContext(Path1);
        Scope s3=(Scope) app1.getBean("scope1");
        Scope s4=(Scope) app1.getBean("scope1");
        System.out.println(s3==s4);
    }
}
