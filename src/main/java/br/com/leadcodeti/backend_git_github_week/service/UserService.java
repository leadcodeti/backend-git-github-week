package br.com.leadcodeti.backend_git_github_week.service;

import br.com.leadcodeti.backend_git_github_week.model.User;
import br.com.leadcodeti.backend_git_github_week.model.dto.input.RegisterData;
import br.com.leadcodeti.backend_git_github_week.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User salvar(RegisterData registerData) {
        User usuario = new User();
        usuario.setName(registerData.getName());
        usuario.setEmail(registerData.getEmail());
        usuario.setPassword(registerData.getPassword());
        return userRepository.save(usuario);
    }

}
