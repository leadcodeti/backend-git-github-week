package br.com.leadcodeti.backend_git_github_week.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping
    public String login(@RequestBody String loginData) {
        return "Parabéns, você está logado!";
    }
}
