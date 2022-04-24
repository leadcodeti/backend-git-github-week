package br.com.leadcodeti.backend_git_github_week.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Integer id;
    private String nome;
    private String email;
}
