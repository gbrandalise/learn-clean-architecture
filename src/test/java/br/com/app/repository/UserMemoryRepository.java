package br.com.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.domain.entity.User;

public class UserMemoryRepository implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public void insert(User user) {
        users.add(user);
    }

    @Override
    public Optional<User> findByUserName(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst();
    }
    
}
