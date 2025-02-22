package com.example.springbootapplication.service;

import com.example.springbootapplication.dtos.ApiResponseDto;
import com.example.springbootapplication.dtos.SignInRequestDto;
import com.example.springbootapplication.dtos.SignUpRequestDto;
import com.example.springbootapplication.exception.RoleNotFoundException;
import com.example.springbootapplication.exception.UserAlreadyExistsException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> signUp(SignUpRequestDto signUpRequestDto) throws UserAlreadyExistsException, RoleNotFoundException;
    ResponseEntity<ApiResponseDto<?>> signIn(SignInRequestDto signInRequestDto);
}
