package br.com.leadcodeti.backend_git_github_week.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private List<Role> roles;
}
