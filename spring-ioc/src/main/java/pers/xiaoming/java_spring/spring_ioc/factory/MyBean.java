package pers.xiaoming.java_spring.spring_ioc.factory;

public class MyBean {
    private String name;

    public MyBean() {
        System.out.println("Executing no arg constructor");
    }

    public MyBean(String name) {
        System.out.println("Executing one arg constructor");
        this.name = name;
    }
}
