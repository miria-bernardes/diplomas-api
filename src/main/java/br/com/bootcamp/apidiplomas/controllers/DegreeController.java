package br.com.bootcamp.apidiplomas.controllers;

import br.com.bootcamp.apidiplomas.dto.StudentDTO;
import br.com.bootcamp.apidiplomas.dto.DegreeDTO;
import br.com.bootcamp.apidiplomas.services.DegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/analyzeNotes")
public class DegreeController {

    private final DegreeService degreeService;

    @Autowired
    public DegreeController(DegreeService degreeService) {
        this.degreeService = degreeService;
    }

    @PostMapping
    public ResponseEntity<DegreeDTO> degree(@RequestBody @Valid StudentDTO studentDTO) {
        return new ResponseEntity<>(degreeService.getDegree(studentDTO), HttpStatus.ACCEPTED);
    }
}
