package br.com.leadcodeti.backend_git_github_week.service;

import br.com.leadcodeti.backend_git_github_week.model.dto.form.LoginData;
import br.com.leadcodeti.backend_git_github_week.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public String register(LoginData loginData) {
        if(
                loginData.getEmail().equals("email") &&
                        loginData.getPassword().equals("password")
        ) {
            return "Parabéns, você logou!";
        }
        return "erro";
    }
}
