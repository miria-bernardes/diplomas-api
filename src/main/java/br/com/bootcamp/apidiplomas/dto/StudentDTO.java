package br.com.bootcamp.apidiplomas.dto;

import lombok.Data;

import java.util.List;

import javax.validation.constraints.*;

@Data
public class StudentDTO {


    @NotNull(message = "student name is mandatory")
    @NotEmpty(message = "student cannot be null")
    @Size(min = 8, max = 50, message = "student name must have length betwen 8 and 50")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "student name must have only alphabets")
    private String name;
    private List<SubjectDTO> subjects;


    public StudentDTO() {

    }

    public StudentDTO(String name, List<SubjectDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
    }


}