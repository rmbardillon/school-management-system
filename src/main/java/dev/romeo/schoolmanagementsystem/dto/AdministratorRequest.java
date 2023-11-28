package dev.romeo.schoolmanagementsystem.dto;

import dev.romeo.schoolmanagementsystem.entity.Administrator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdministratorRequest {
    private Administrator administrator;
}
