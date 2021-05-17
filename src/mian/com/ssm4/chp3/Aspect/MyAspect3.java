package mian.com.ssm4.chp3.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*
切面类
在此类中编写通知
 */
@Aspect
@Component
public class MyAspect3 {
    //切入点
    @Pointcut("execution(* mian.com.ssm4.chp3.Dao.*.*(..))")
    private void myPointCut(){}
    //前置通知
    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知：权限检查");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println(",被植入增强处理的目标方法:"+joinPoint.getSignature().getName());
    }
    //后置通知
    @AfterReturning("myPointCut()")
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("后置通知：记录日志");
        System.out.println(",被植入增强处理的目标方法:"+joinPoint.getSignature().getName());
    }
    //环绕通知
    @Around("myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕开始：开启事务");
        //执行当前目标方法
        Object obj=proceedingJoinPoint.proceed();
        System.out.println("环绕开始：关闭事务");
        return obj;
    }
    //异常通知
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void myAfterThrowing(JoinPoint joinpoint,Throwable e){
        System.out.println("异常通知："+"出错了"+e.getMessage());
    }
    //最终通知
    @After("myPointCut()")
    public void myAfter(){
        System.out.println("释放资源");
    }
}
