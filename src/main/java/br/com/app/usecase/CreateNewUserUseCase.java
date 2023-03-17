package br.com.app.usecase;

import br.com.app.exception.UsernameAlreadyExistsException;
import br.com.app.repository.UserRepository;
import br.com.domain.entity.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateNewUserUseCase {

    @NonNull private UserRepository userRepository;

    public void execute(String username, String password) {
        if (userRepository.findByUserName(username).isPresent()) {
            throw new UsernameAlreadyExistsException();
        }
        User user = new User(username, password);
        userRepository.insert(user);
    }
    
}
