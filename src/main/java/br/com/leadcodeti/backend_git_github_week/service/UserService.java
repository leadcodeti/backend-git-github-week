package br.com.leadcodeti.backend_git_github_week.service;

import br.com.leadcodeti.backend_git_github_week.configuration.mapper.UserMapper;
import br.com.leadcodeti.backend_git_github_week.model.User;
import br.com.leadcodeti.backend_git_github_week.model.dto.UserDto;
import br.com.leadcodeti.backend_git_github_week.model.dto.input.RegisterData;
import br.com.leadcodeti.backend_git_github_week.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;
    public User save(RegisterData registerData) {
        User usuario = new User();
        usuario.setName(registerData.getName());
        usuario.setEmail(registerData.getEmail());
        usuario.setPassword(registerData.getPassword());
        return userRepository.save(usuario);
    }

    public List<UserDto> retrieve() {
        List<User> retrieveUsers = userRepository.findAll();
        return retrieveUsers
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());

    }

}
