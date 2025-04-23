package com.example.bookcatalog.repository;

import com.example.bookcatalog.model.Book;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryBookRepository implements BookRepository {  // Utilise l'interface
    // Implémentation...
}