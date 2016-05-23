package training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import training.model.Issue;
import training.model.User;
import training.service.IssueService;
import training.service.ProjectService;
import training.service.UserService;


@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private IssueService issueService;

    @RequestMapping("/")
    public String index(Model model) {
       // model.addAttribute("projects", projectService.getAll());
      //  model.addAttribute("users", userService.getAllUsers());
        return "index";
    }
    @RequestMapping(value = "/issues", method = RequestMethod.GET)
    public String listIssues(Model model) {
        model.addAttribute("issues", issueService.getAllIssues());
        return "issues";
    }

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.getAll());
        return "projects";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @RequestMapping("/user_add_page")
    public String userAddPage(Model model) {
        // model.addAttribute("projects", projectService.getAll());
        return "user_add_page";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String userAdd(@RequestParam(value="username", required=false) String username,
                          @RequestParam(value="name", required=false) String name,
                          @RequestParam(value="surname", required=false) String surname,
                          @RequestParam(value="email", required=false) String email,
                          Model model) {
        //Project project = (projectId != DEFAULT_GROUP_ID) ? projectService.findProject(projectId) : null;

        User user = new User(username, name, surname, email);
        userService.addUser(user);

        // model.addAttribute("projects", userService.listProjects());
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @RequestMapping("/issue_add_page")
    public String issueAddPage(Model model) {
        return "issue_add_page";
    }

    @RequestMapping(value = "/issue/add", method = RequestMethod.POST)
    public String issueAdd(@RequestParam(value="reporterId", required=false) int reporterId,
                          @RequestParam(value="asigneeId", required=false) int asigneeId,
                          @RequestParam(value="title", required=false) String title,
                          @RequestParam(value="description", required=false) String description,
                           @RequestParam(value="priority", required=false) String priority,
                           @RequestParam(value="status", required=false) String status,
                           @RequestParam(value="projectId", required=false) int projectId,
                          Model model) {
        //Project project = (projectId != DEFAULT_GROUP_ID) ? projectService.findProject(projectId) : null;

        Issue issue = new Issue(reporterId, asigneeId, title, description, priority, status, projectId);
        issueService.addIssue(issue);

        // model.addAttribute("projects", userService.listProjects());
        model.addAttribute("issues", issueService.getAllIssues());
        return "issues";
    }
}
