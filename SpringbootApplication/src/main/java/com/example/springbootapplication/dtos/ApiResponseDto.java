package com.example.springbootapplication.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
@AllArgsConstructor
@Data
@Builder
public class ApiResponseDto<T> {
    private String status;
    private String message;
    private T response;
}
