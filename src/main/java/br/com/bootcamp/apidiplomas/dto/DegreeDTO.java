package br.com.bootcamp.apidiplomas.dto;


import lombok.Data;

import java.util.Objects;

@Data
public class DegreeDTO {

    private String message;
    private Double average;
    private StudentDTO student;

    public DegreeDTO(String message, Double average, StudentDTO student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DegreeDTO)) return false;
        DegreeDTO degreeDTO = (DegreeDTO) o;
        return Objects.equals(getMessage(), degreeDTO.getMessage()) &&
                Objects.equals(getAverage(), degreeDTO.getAverage()) &&
                Objects.equals(getStudent(), degreeDTO.getStudent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getAverage(), getStudent());
    }
}
