package sy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sy.model.User;
import sy.service.UserServiceI;

public class TestMybatis {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml","spring-mybatis.xml");
        UserServiceI userServiceI=ac.getBean("userService",UserServiceI.class);
        User u=userServiceI.getUserById("0");
        System.out.println(u);
    }

}
