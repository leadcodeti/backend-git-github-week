package br.com.leadcodeti.backend_git_github_week.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "\"user\"")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;
    @Column(length = 30, nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(length = 30, nullable = false)
    private String password;
    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = {
                @JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "role_id", referencedColumnName = "id")
            })
    private Set<Role> roles;
}
