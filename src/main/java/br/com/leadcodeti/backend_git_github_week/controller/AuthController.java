package br.com.leadcodeti.backend_git_github_week.controller;

import br.com.leadcodeti.backend_git_github_week.model.dto.input.LoginData;
import br.com.leadcodeti.backend_git_github_week.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @CrossOrigin
    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginData loginData) {
       return authService.register(loginData);
    }
}
