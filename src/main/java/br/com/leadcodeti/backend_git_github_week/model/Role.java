package br.com.leadcodeti.backend_git_github_week.model;

import lombok.Data;

import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Data
public class Role implements Serializable {
    private Integer id;
    private String nome;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
