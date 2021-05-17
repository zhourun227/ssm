package mian.com.ssm4.chp3.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect1 {
    //前置通知
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知：权限检查");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println(",被植入增强处理的目标方法:"+joinPoint.getSignature().getName());
    }
    //后置通知
    public void myAfterReturning(JoinPoint joinPoint,Object returnVal){
        System.out.println("后置通知：记录日志");
        System.out.println(",被植入增强处理的目标方法:"+joinPoint.getSignature().getName()+"returnVal"+returnVal);
    }
    //环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕开始：开启事务");
        //执行当前目标方法
        Object obj=proceedingJoinPoint.proceed();
        System.out.println("环绕开始：关闭事务");
        return obj;
    }
    //异常通知
    public void myAfterThrowing(JoinPoint joinpoint,Throwable e){
        System.out.println("异常通知："+"出错了"+e.getMessage());
    }
    //最终通知
    public void myAfter(){
        System.out.println("释放资源");
    }
}
