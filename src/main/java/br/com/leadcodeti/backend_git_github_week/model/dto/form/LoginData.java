package br.com.leadcodeti.backend_git_github_week.model.dto.form;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class LoginData implements Serializable {
    String email;
    String password;
}
