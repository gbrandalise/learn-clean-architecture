package br.com.domain.entity;

import java.util.regex.Pattern;

class PasswordStrenthRule {

    private static final Pattern upperCasePattern = Pattern.compile("^.*[A-Z].*$");
    private static final Pattern lowerCasePattern = Pattern.compile("^.*[a-z].*$");
    private static final Pattern numberPattern = Pattern.compile("^.*[0-9].*$");
    private static final Pattern specialCharPattern = Pattern.compile("^.*\\W.*$");

    boolean isValid(String password) {
        return password.length() >= 8
            && containsRequiredChars(password);
    }

    private boolean containsRequiredChars(String password) {
        return contanisUpperCaseLetter(password)
            && containsLowerCaseLetter(password)
            && containsNumber(password)
            && containsSpecialChar(password);
    }

    private boolean contanisUpperCaseLetter(String password) {
        return upperCasePattern.matcher(password).matches();
    }

    private boolean containsLowerCaseLetter(String password) {
        return lowerCasePattern.matcher(password).matches();
    }

    private boolean containsNumber(String password) {
        return numberPattern.matcher(password).matches();
    }

    private boolean containsSpecialChar(String password) {
        return specialCharPattern.matcher(password).matches();
    }
    
}
