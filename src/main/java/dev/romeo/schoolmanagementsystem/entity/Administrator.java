package dev.romeo.schoolmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Administrator {
    @Id
    @GeneratedValue
    private UUID adminId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String email;
    private String password;
}
