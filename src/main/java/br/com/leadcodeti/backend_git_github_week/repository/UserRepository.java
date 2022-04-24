package br.com.leadcodeti.backend_git_github_week.repository;

import br.com.leadcodeti.backend_git_github_week.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
