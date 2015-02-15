package ru.home.main;

import config.Config;
import config.R;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.home.ioc.BeanList;
import ru.home.ioc.IPrintf;
import ru.home.ioc.Printer;
import ru.home.ioc.Single;

/**
 * Created by dima on 14.02.15.
 */
public class Main {
    private static String LOG_PROPERTIES_FILE = R.Log.LOG_PROPERTIES_FILE;
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        // log4j
        Config conf = new Config(LOG_PROPERTIES_FILE);
        conf.init();

        logger.info("Program run...");

        workWithSpring();
    }

    private static void workWithSpring() {
        ApplicationContext actx = new ClassPathXmlApplicationContext(R.Spring.SPRING_CONFIG_FILE);

        IPrintf ptr = (IPrintf) actx.getBean("print");
        Single single = (Single) actx.getBean("single");
        BeanList beanList = (BeanList) actx.getBean("proxy");

//        IPrintf ptr = new Printer("Hello world!!");
//        Single single = Single.getInstance();
        ptr.printf();
        double res = single.pow(7);
        System.out.println("res = "+res);
//        int a = beanList.getA();
//        System.out.println("beanList a:"+a);
        beanList.setA(10);
//        beanList.printList();

        /*
        AOP
        Рекомендации:
        1. before - до метода           MethodBeforeAdvice
        2. after - после метода         AfterReturningAdvice
        3. around - до и после метода   MethodInterceptor
        4. throws - после генерации искл. ситуации  ThrowsAdvice
         */
    }
}
