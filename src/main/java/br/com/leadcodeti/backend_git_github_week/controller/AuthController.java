package br.com.leadcodeti.backend_git_github_week.controller;

import br.com.leadcodeti.backend_git_github_week.model.dto.form.LoginData;
import br.com.leadcodeti.backend_git_github_week.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping
    public String login(@RequestBody LoginData loginData) {
       return authService.register(loginData);
    }
}
