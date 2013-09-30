package spring.joy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements InitializingBean, DisposableBean {
    public static final String CONST = "test";


    public Bean() {
        System.out.println("i'm constructed");
    }

    @Resource
    public void setProp(String prop) {
        System.out.println("i'm getting my setter called: " + prop);
    }

    public void doWork() {
        System.out.println("Boy! I'm being worked on!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet");
    }

    public void initFromCtx() {
        System.out.println("initFromCtx");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct");
    }

    //------------------

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy");
    }

    public void destroyFromCtx() {
        System.out.println("destroyFromCtx");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy");
    }

    //------------------

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("This is the end!");
    }
}
