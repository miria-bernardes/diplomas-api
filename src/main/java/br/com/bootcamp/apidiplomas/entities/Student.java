package br.com.bootcamp.apidiplomas.entities;

import lombok.Data;

import java.util.List;

@Data
public class Student {

    private String name;
    private List<Subject> subjects;

}
