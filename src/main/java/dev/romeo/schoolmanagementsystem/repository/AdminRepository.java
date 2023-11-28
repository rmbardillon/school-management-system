package dev.romeo.schoolmanagementsystem.repository;

import dev.romeo.schoolmanagementsystem.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AdminRepository extends JpaRepository<Administrator, UUID> {
    Optional<Administrator> findByEmail(String email);
}
