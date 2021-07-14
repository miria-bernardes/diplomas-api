package br.com.bootcamp.apidiplomas.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class StudentAnalyzedDTO {
    private String message;
    private double average;
    private StudentDTO studentDTO;

    public StudentAnalyzedDTO(double avg, StudentDTO studentDTO) {
        this.message = "sua média final: " + avg;
        this.average = avg;
        this.studentDTO = studentDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentAnalyzedDTO)) return false;
        StudentAnalyzedDTO that = (StudentAnalyzedDTO) o;
        return Double.compare(that.getAverage(), getAverage()) == 0 &&
                Objects.equals(getMessage(), that.getMessage()) &&
                Objects.equals(getStudentDTO(), that.getStudentDTO());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getAverage(), getStudentDTO());
    }
}
