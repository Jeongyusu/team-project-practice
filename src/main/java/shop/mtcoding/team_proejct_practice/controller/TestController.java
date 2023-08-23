package shop.mtcoding.team_proejct_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/")
    public String test() {
        return "redirect:/";
    }

}
