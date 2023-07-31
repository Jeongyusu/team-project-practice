package shop.mtcoding.team_proejct_practice.controller;

import org.hibernate.internal.util.collections.JoinedIterator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class UserController {

    @PostMapping("/join")
    public String jain(){
        return "redirect:/";
    }

}
