package br.com.bootcamp.apidiplomas.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionMessageDTO {

    private int statusCode;
    private String field;
    private String message;


}
