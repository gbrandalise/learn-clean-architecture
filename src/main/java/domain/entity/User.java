package domain.entity;

import domain.exception.PasswordStrengthException;
import domain.exception.UsernameLengthException;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class User {

    private String username;
    private String password;

    public User(
        @NonNull String username,
        @NonNull String password
    ) {
        validate(username, password);
        this.username = username;
        this.password = password;
    }

    private void validate(String username, String password) {
        validateUsername(username);
        validatePassword(password);
    }

    private void validateUsername(String username) {
        if (username.length() < 8) {
            throw new UsernameLengthException();
        }
    }

    private void validatePassword(String password) {
        PasswordStrenthRule passwordStrenthRule = new PasswordStrenthRule();
        if (!passwordStrenthRule.isValid(password)) {
            throw new PasswordStrengthException();
        }
    }
    
}
