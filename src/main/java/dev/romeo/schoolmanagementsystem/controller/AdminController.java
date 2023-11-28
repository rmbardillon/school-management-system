package dev.romeo.schoolmanagementsystem.controller;

import dev.romeo.schoolmanagementsystem.dto.AdministratorRequest;
import dev.romeo.schoolmanagementsystem.entity.Administrator;
import dev.romeo.schoolmanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/admin")
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/{username}")
    public ResponseEntity<Optional<Administrator>> getAdministrator(@PathVariable String username) {
        return new ResponseEntity<Optional<Administrator>>(adminService.getAdministrator(username), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Object> insertAdministrator(@RequestBody AdministratorRequest administratorRequest) {
        return adminService.insertAdministrator(administratorRequest);
    }

}
