package br.com.bootcamp.apidiplomas;

import br.com.bootcamp.apidiplomas.dto.StudentAnalyzedDTO;
import br.com.bootcamp.apidiplomas.dto.StudentDTO;
import br.com.bootcamp.apidiplomas.dto.SubjectDTO;
import br.com.bootcamp.apidiplomas.entities.Subject;
import br.com.bootcamp.apidiplomas.services.DegreeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class CertificateServiceImplTest {

    @InjectMocks private DegreeService service;

    @BeforeEach
    void init_mocks() {
        MockitoAnnotations.openMocks(this);
    }

    private StudentDTO getStudentMock() {
        SubjectDTO subject1 = new SubjectDTO("Algoritms and data structures", 9.0);
        SubjectDTO subject2 = new SubjectDTO("Computer Networks", 10.0);
        List<SubjectDTO> subjects = Arrays.asList(subject1, subject2);
        return new StudentDTO("Miria Bernardes", subjects);
    }

    private StudentAnalyzedDTO getAnalyzedStudentMock() {
        return new StudentAnalyzedDTO(service.calcAverage(getStudentMock().getSubjects()), getStudentMock());
    }


    @Test
    void shouldBeEqualsStudentMock() {
        Assertions.assertEquals(service.analyzeNotes(getStudentMock()),getAnalyzedStudentMock());
    }


    @Test
    void shouldReturnNineDotFive() {
        Assertions.assertEquals(service.calcAverage(getStudentMock().getSubjects()), 9.5);
    }
}
