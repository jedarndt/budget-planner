package com.neo4j.budgetPlanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeathCheckController {

    @RequestMapping("/health")
        public String index() {
            return "Budget Planner Application is running!!";
        }

}
