package com.example.etudiantapi.repository;

import com.example.etudiantapi.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
