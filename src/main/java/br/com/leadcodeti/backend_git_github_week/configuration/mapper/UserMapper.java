package br.com.leadcodeti.backend_git_github_week.configuration.mapper;

import br.com.leadcodeti.backend_git_github_week.model.User;
import br.com.leadcodeti.backend_git_github_week.model.dto.UserDto;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserMapper {
    public UserDto toDto(User user) {
        Integer id = user.getId();
        String name = user.getName();
        String email = user.getEmail();
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }

}
