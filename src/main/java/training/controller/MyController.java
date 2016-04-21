package training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import training.dao.IssueService;

/**
 * Created by Oksana_Eryomenko on 4/21/2016.
 */

@Controller
@RequestMapping("/")
public class MyController {
    // blah blah blah
    //mapping between methods and pages
    @Autowired
    private IssueService issueService;
}
