package br.com.leadcodeti.backend_git_github_week.Controller;

import br.com.leadcodeti.backend_git_github_week.model.dto.form.RegisterData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    public String register(RegisterData registerData) {
        return "em construção...";
    }
}
