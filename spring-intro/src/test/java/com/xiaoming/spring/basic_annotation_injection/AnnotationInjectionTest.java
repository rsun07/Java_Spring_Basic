package com.xiaoming.spring.basic_annotation_injection;

import com.xiaoming.spring.basic_annotation_injection.autowired_bean.MyService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationInjectionTest {
    private ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    public void testConstructorAutowired() {
        MyService myService = (MyService) appContext.getBean("myConstructorAutowired");
        Assert.assertEquals("myRepo", myService.showRepo());
    }

    @Test
    public void testParameterAutowired() {
        // use spring default bean name
        MyService myService = (MyService) appContext.getBean("myParameterAutowired");
        Assert.assertEquals("My Repository", myService.showRepo());
    }

    @Test
    public void testParameterInject() {
        // use customized bean name
        MyService myService = (MyService) appContext.getBean("customized bean name: parameter inject");
        Assert.assertEquals("My Repository", myService.showRepo());
    }

    @Test
    public void testSetterAutowired() {
        MyService myService = (MyService) appContext.getBean("mySetterAutowired");
        Assert.assertEquals("myRepo", myService.showRepo());
    }
}
