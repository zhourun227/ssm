package mian.com.ssm4.chp3.Aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_permissions();

        //执行目标方法
        Object obj=methodInvocation.proceed();

        log();
        return obj;
    }
    public void check_permissions(){
        System.out.println("检查权限...");
    }
    public void log(){
        System.out.println("打印日志...");
    }
}
