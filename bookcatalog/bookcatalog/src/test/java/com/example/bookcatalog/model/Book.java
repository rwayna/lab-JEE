package com.example.bookcatalog.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long id;

    @NotBlank(message = "Le titre est obligatoire")
    @Size(min = 1, max = 100, message = "Le titre doit contenir entre 1 et 100 caractères")
    private String title;

    @NotBlank(message = "L'auteur est obligatoire")
    @Size(min = 2, max = 50, message = "Le nom de l'auteur doit contenir entre 2 et 50 caractères")
    private String author;

    @NotBlank(message = "L'ISBN est obligatoire")
    @Pattern(
            regexp = "^(?:ISBN(?:-13)?:? )?(?=[0-9]{13}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)",
            message = "Format ISBN invalide (ex: 978-3-16-148410-0)"
    )
    private String isbn;

    @NotNull(message = "La date de publication est obligatoire")
    @PastOrPresent(message = "La date ne peut pas être dans le futur")
    private LocalDate publicationDate;

    @Min(value = 1, message = "Le livre doit avoir au moins 1 page")
    @Max(value = 10000, message = "Le nombre de pages ne peut excéder 10 000")
    private int pageCount;

    @Size(max = 50, message = "Le genre ne peut excéder 50 caractères")
    private String genre;

    @Size(max = 500, message = "La description ne peut excéder 500 caractères")
    private String description;
}