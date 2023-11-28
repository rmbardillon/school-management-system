package dev.romeo.schoolmanagementsystem.service;

import dev.romeo.schoolmanagementsystem.dto.AdministratorRequest;
import dev.romeo.schoolmanagementsystem.entity.Administrator;
import dev.romeo.schoolmanagementsystem.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public ResponseEntity<Object> insertAdministrator(AdministratorRequest administratorRequest) {
        if (adminRepository.findByEmail(administratorRequest.getAdministrator().getEmail()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Duplicate Email"); // 409 Conflict for duplicate email
        }

        Administrator savedAdministrator = adminRepository.save(administratorRequest.getAdministrator());
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAdministrator); // 201 Created for successful creation
    }

    public Optional<Administrator> getAdministrator(String email) {
        return adminRepository.findByEmail(email);
    }
}
