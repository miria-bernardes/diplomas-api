package br.com.bootcamp.apidiplomas.validators;

import java.util.Optional;

import br.com.bootcamp.apidiplomas.enums.CharacterValidator;

public class DataValidator {
    public boolean verifyIfDataContainsLengthMandatory(String param, CharacterValidator validator) {
        return param.length() >= validator.minimum && param.length() <= validator.maximum;
    }

    public boolean verifyIfDataContainsOnlyAlphabets(String param, CharacterValidator validator) {
        return (param.matches(validator.pattern) && !param.equals("") && Optional.of(param).isPresent());
    }
}
