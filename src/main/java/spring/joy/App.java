package spring.joy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] params) {
        System.runFinalizersOnExit(true);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        Bean bean = ctx.getBean(Bean.class);
        bean.doWork();
        ctx.close();
    }
}
