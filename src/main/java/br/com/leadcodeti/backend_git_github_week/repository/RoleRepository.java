package br.com.leadcodeti.backend_git_github_week.repository;

import br.com.leadcodeti.backend_git_github_week.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
