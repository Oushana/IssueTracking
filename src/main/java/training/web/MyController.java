package training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
}
