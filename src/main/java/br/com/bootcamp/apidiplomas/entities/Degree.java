package br.com.bootcamp.apidiplomas.entities;


import lombok.Data;

@Data
public class Degree {

    private String message;
    private Double average;
    private Student student;

    public Degree(String message, Double average, Student student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }
}
