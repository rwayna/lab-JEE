package com.example.springthymeleaflab.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {

    @NotBlank(message = "Le nom est requis")
    @Size(min = 2, max = 50, message = "Le nom doit comporter entre 2 et 50 caractères")
    private String name;

    @NotBlank(message = "L'email est requis")
    @Email(message = "Veuillez fournir une adresse email valide")
    private String email;

    @NotBlank(message = "La spécialité est requise")
    private String major;

    // Constructeurs, getters et setters
}
