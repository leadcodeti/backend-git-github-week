package br.com.leadcodeti.backend_git_github_week.controller;

import br.com.leadcodeti.backend_git_github_week.model.dto.UserDto;
import br.com.leadcodeti.backend_git_github_week.model.dto.form.RegisterData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserDto> register(@RequestBody RegisterData registerData) {
        return ResponseEntity.ok(new UserDto(1, registerData.getName(), registerData.getEmail()));
    }
}
