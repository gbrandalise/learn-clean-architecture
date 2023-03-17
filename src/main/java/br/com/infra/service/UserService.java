package br.com.infra.service;

import org.springframework.stereotype.Service;

import br.com.infra.dto.UserDto;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    @NonNull private CreateNewUserService createNewUserService;

    public void insert(UserDto user) {
        createNewUserService.execute(user.getUsername(), user.getPassword());
    }
    
}
