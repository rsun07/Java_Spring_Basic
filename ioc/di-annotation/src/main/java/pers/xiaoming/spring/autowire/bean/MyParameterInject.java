package pers.xiaoming.spring.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pers.xiaoming.spring.autowire.repository.MyRepository;

@Controller("customized bean name: parameter inject")
public class MyParameterInject implements MyService {
    @Autowired
    @Qualifier("My Repository")
    private MyRepository myRepo;

    public String showRepo() {
        return myRepo.showRepo();
    }
}
