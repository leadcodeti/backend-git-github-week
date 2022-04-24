package br.com.leadcodeti.backend_git_github_week.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class User implements Serializable {
    @Id
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = {
                @JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "role_id", referencedColumnName = "id")
            })
    private List<Role> roles;
}
