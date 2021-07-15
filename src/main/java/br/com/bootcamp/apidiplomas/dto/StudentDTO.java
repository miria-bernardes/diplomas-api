package br.com.bootcamp.apidiplomas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.*;

@Data
public class StudentDTO {


    @NotNull(message = "student name is mandatory")
    @NotEmpty(message = "student cannot be null")
    @Size(min = 8, max = 50, message = "student name must have length betwen 8 and 50")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "student name must have only alphabets")
    private String name;
    private List<SubjectDTO> subjects = new ArrayList<>();

    public StudentDTO(String name, List<SubjectDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDTO)) return false;
        StudentDTO that = (StudentDTO) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getSubjects(), that.getSubjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubjects());
    }
}