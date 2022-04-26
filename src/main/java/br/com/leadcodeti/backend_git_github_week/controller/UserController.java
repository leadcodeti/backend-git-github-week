package br.com.leadcodeti.backend_git_github_week.controller;

import br.com.leadcodeti.backend_git_github_week.model.User;
import br.com.leadcodeti.backend_git_github_week.model.dto.UserDto;
import br.com.leadcodeti.backend_git_github_week.model.dto.input.RegisterData;
import br.com.leadcodeti.backend_git_github_week.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/register")
public class UserController {

    @Autowired
    UserService registerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserDto> register(@Valid @RequestBody RegisterData registerData) {
        User usuario = registerService.salvar(registerData);
        return ResponseEntity.ok(new UserDto(usuario.getId(), usuario.getName(), usuario.getEmail()));
    }
}
