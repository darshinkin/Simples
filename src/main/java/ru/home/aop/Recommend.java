package ru.home.aop;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by dima on 13.02.15.
 */
public class Recommend implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("До метода!!!");
    }
    /* public void afterThrowing(Exception ex) {
        System.out.println("Have been generated the exception!!!");
    }
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // before
        System.out.println("До метода!!!");
        Object res = null;
        try {
            res = invocation.proceed();
            // after
            System.out.println("После метода!!!");
        } catch (Exception ex) {
            System.out.println("During generation the exception ...");
//            ex.printStackTrace();
        }
        return res;
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("После метода!!!");
    }*/


}
