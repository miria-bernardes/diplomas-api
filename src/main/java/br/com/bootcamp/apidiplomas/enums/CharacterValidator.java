package br.com.bootcamp.apidiplomas.enums;

public enum CharacterValidator {
    STRING_MANDATORY_REQUIREMENT("^[a-zA-Z]*$" , 8, 50),
    NUMBER_MANDATORY_REQUIREMENT("[0-9]*", 1, 2);

    public final String pattern;
    public final int minimum;
    public final int maximum;


    private CharacterValidator(String pattern, int minimum, int maximum) {
        this.pattern = pattern;
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
