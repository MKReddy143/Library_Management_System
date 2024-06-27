package com.java.LibraryManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.LibraryManagementSystem.Entity.Book;
import com.java.LibraryManagementSystem.Repository.BookRepository;

@Service
public class Bookservice {
	@Autowired
	private BookRepository bRepo;

	public void save(Book b) {
		bRepo.save(b);
	}

	public List<Book> getAllBook() {
		return bRepo.findAll();
	}

	public Book getBookById(int id) {
		return bRepo.findById(id).get();
	}

	public void deleteById(int id) {
		bRepo.deleteById(id);
	}

}
