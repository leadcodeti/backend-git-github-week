package br.com.leadcodeti.backend_git_github_week.service;

import br.com.leadcodeti.backend_git_github_week.model.User;
import br.com.leadcodeti.backend_git_github_week.model.dto.form.LoginData;
import br.com.leadcodeti.backend_git_github_week.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public String register(LoginData loginData) {
        Optional<User> user = userRepository.findByEmail(loginData.getEmail());
        if(user.isPresent()) {
            if(
                    loginData.getEmail().equals(user.get().getEmail()) &&
                            loginData.getPassword().equals(user.get().getPassword())
            ) {
                return "Parabéns, " + user.get().getName() + ", Você é um verdadeiro Leader. ;)";
            }
        }

        return "Não foi possível autenticar os seus dados. Verifique se o seu email e senha estão corretos.";
    }
}
