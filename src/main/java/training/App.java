package training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import training.model.User;

/**
 * Created by Oksana_Eryomenko on 5/6/2016.
 */
public class App {
    public static void main(String[] args){
        System.out.println("Hello World");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        User oneUser = (User) ctx.getBean("user");

        System.out.println("first user: " + oneUser.toString());
    }
}
