package com.java.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.LibraryManagementSystem.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
