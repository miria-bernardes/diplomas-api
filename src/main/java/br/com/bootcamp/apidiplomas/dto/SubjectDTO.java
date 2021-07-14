package br.com.bootcamp.apidiplomas.dto;

import javax.validation.constraints.*;

public class SubjectDTO {

    @NotNull(message = "subject name is mandatory")
    @Size(min = 8, max = 50, message = "subject name must have length betwen 8 and 50")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "subject name must have only alphabets")
    private String name;

    @NotNull(message = "note field is mandatory")
    @Size(min = 1, max = 2, message = "note must have length betwen 1 and 2")
    @Pattern(regexp = "^[0-9]", message = "note must have only number")
    private int note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
    
}
