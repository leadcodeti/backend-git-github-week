package br.com.leadcodeti.backend_git_github_week.Controller;

import br.com.leadcodeti.backend_git_github_week.model.dto.form.LoginData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping
    public String login(@RequestBody LoginData loginData) {
        if(loginData.getEmail().equals("sir.costa@yahoo.com.br") && loginData.getPassword().equals("123")){
            return "Parabéns, você está logado!";
        }

        return "erro";
    }
}
