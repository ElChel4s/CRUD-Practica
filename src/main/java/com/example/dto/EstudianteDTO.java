package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;

@Data  // Lombok generará automáticamente los getters y setters
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstudianteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private String numeroInscripcion;
}
