package br.com.bootcamp.apidiplomas.dto;


import lombok.Data;

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
}
