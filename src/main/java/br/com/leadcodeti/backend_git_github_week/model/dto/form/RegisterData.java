package br.com.leadcodeti.backend_git_github_week.model.dto.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterData {
    private String nome;
    private String email;
    private String password;
}
