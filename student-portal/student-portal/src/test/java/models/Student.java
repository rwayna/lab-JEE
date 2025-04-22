package com.example.studentportal.model;

import jakarta.validation.constraints.*;

public class Student {
    private Long id;

    @NotBlank(message = "Le nom est requis")
    @Size(min = 2, max = 50, message = "Le nom doit contenir entre 2 et 50 caractères")
    private String name;

    @NotNull(message = "L'âge est requis")
    @Min(value = 16, message = "L'âge doit être d'au moins 16 ans")
    private Integer age;

    @NotBlank(message = "L'email est requis")
    @Email(message = "Veuillez fournir une adresse email valide")
    private String email;

    @NotBlank(message = "Le cours est requis")
    private String course;

    @Pattern(regexp = "^[A-Z0-9]{8}$", message = "L'ID étudiant doit contenir 8 caractères en majuscules et chiffres uniquement")
    private String studentId;

    // Constructeurs, getters et setters...
}