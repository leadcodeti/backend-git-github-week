package br.com.leadcodeti.backend_git_github_week.model.dto.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class RegisterData {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 100, message = "Name must be between 10 and 100 characters")
    private String name;

    @Email(message = "Email should be valid")
    @NotNull(message = "Email cannot be null")
    private String email;

    @Size(min = 6, max = 30, message = "Password must be between 6 and 30 characters")
    @NotNull(message = "Password cannot be null")
    private String password;
}
