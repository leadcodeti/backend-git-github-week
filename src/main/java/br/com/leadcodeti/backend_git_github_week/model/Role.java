package br.com.leadcodeti.backend_git_github_week.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Role implements Serializable {
    private Integer id;
    private String nome;
    private List<User> users;
}
