package br.com.app.repository;

import java.util.Optional;

import br.com.domain.entity.User;

public interface UserRepository {

    void insert(User user);

    Optional<User> findByUserName(String username);
    
}
