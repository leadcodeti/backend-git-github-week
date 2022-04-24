package br.com.leadcodeti.backend_git_github_week.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Usuario implements Serializable {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
}
