package com.example.studentportal.service;

import com.example.studentportal.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    /**
     * Récupère tous les étudiants
     * @return Liste de tous les étudiants
     */
    List<Student> getAllStudents();

    /**
     * Trouve un étudiant par son ID
     * @param id L'identifiant de l'étudiant
     * @return Un Optional contenant l'étudiant s'il existe
     */
    Optional<Student> getStudentById(Long id);

    /**
     * Sauvegarde un étudiant (création ou mise à jour)
     * @param student L'étudiant à sauvegarder
     * @return L'étudiant sauvegardé avec son ID
     */
    Student saveStudent(Student student);

    /**
     * Supprime un étudiant
     * @param id L'identifiant de l'étudiant à supprimer
     */
    void deleteStudent(Long id);
}