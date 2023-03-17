package br.com.infra.service;

import org.springframework.stereotype.Component;

import br.com.app.repository.UserRepository;
import br.com.app.usecase.CreateNewUserUseCase;
import lombok.NonNull;

@Component
public class CreateNewUserService extends CreateNewUserUseCase {

    public CreateNewUserService(@NonNull UserRepository userRepository) {
        super(userRepository);
    }
    
}
