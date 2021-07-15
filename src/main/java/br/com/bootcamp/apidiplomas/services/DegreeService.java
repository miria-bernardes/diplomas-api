package br.com.bootcamp.apidiplomas.services;

import br.com.bootcamp.apidiplomas.dto.DegreeDTO;
import br.com.bootcamp.apidiplomas.dto.StudentAnalyzedDTO;
import br.com.bootcamp.apidiplomas.dto.StudentDTO;
import br.com.bootcamp.apidiplomas.dto.SubjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DegreeService {

    public DegreeDTO getDegree(StudentDTO student) {
        double average = calcAverage(student.getSubjects());

        String message = withHonors(average) ? "Parabéns, " + student.getName() +
                " você foi aprovado com uma das melhores notas da turma!" : "Diploma de " +
                student.getName() + ".";

        return new DegreeDTO(message, average, student);
    }

    public boolean withHonors(double average) {
        return average > 9;
    }

    public double calcAverage(List<SubjectDTO> subjects) {
        return subjects.stream().mapToDouble(SubjectDTO::getNote).average().getAsDouble();
    }

    public StudentAnalyzedDTO analyzeNotes(StudentDTO student) {
        return new StudentAnalyzedDTO(calcAverage(student.getSubjects()), student);
    }
}
