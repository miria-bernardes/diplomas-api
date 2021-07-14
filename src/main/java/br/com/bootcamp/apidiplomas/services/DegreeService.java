package br.com.bootcamp.apidiplomas.services;

import br.com.bootcamp.apidiplomas.dto.DegreeDTO;
import br.com.bootcamp.apidiplomas.dto.StudentDTO;
import br.com.bootcamp.apidiplomas.dto.SubjectDTO;
import org.springframework.stereotype.Service;


@Service
public class DegreeService {

    public DegreeDTO getDegree(StudentDTO student) {
        double average = student.getSubjects().stream().mapToDouble(SubjectDTO::getNote).average().getAsDouble();

        String message = average > 9 ? "Parabéns, " + student.getName() +
                " você foi aprovado com uma das melhores notas da turma!" : "Diploma de " +
                student.getName() + ".";

        return new DegreeDTO(message, average, student);
    }
}
