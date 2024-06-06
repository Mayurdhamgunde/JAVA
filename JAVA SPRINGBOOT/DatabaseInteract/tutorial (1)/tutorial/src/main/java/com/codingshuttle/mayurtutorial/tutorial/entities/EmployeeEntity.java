package com.codingshuttle.mayurtutorial.tutorial.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id                         // provide for primary(unique) key
    @GeneratedValue(strategy = GenerationType.AUTO)     // Automatic generate new Id when new employee is added
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;
}
