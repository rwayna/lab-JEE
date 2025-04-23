package com.example.etudiantapi.model;

import jakarta.persistence.*;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;

    // Getters & Setters
}
