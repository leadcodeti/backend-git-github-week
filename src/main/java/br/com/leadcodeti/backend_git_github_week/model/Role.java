package br.com.leadcodeti.backend_git_github_week.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Role implements Serializable {
    @Id
    private Integer id;
    private String nome;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
