package training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import training.model.User;
import training.service.IssueService;
import training.service.ProjectService;
import training.service.UserService;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = ctx.getBean(UserService.class);
        System.out.println("--users--");
        System.out.println(userService.sayGreeting());
        System.out.println(userService.getUserByEmail("user1@email.com"));

       // userService.addUser(new User("user12", "Ivan12", "Ivanov12", "user12@email.com"));
        System.out.println("---");
        //System.out.println(userService.getUserByEmail("user11@email.com"));
        System.out.println(userService.getAll());
        userService.delete(1015);
        System.out.println("---");
        System.out.println(userService.getAll());


       // IssueService issueService = ctx.getBean(IssueService.class);
        //System.out.println("--issues--");
        //System.out.println(issueService.getIssueByReporterId(1002));


        //ProjectService projectService = ctx.getBean(ProjectService.class);
        //System.out.println("--projects--");
        //System.out.println(projectService.getByName("Project3"));

    }


}
