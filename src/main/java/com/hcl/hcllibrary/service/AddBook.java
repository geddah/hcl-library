package com.hcl.hcllibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.hcl.hcllibrary.entity.Book;
import com.hcl.hcllibrary.entity.Inventory;
import com.hcl.hcllibrary.repository.BookRepository;
import com.hcl.hcllibrary.utils.LibraryConstants;

@Service
public class AddBook {

	@Autowired
	private BookRepository bookRepository;
	
	public ResponseEntity<Book> addBook(JsonNode request) {
		ResponseEntity<Book> response = null;
		
		
		Integer quantity = request.path("quantity").asInt();
		Long userId = request.path("userId").asLong();
		
		for(int i = 0; i < quantity; i++) {
			//Add Book
			Book book = new Book();
			book.setAuthor(request.path("author").asText());
			book.setCategory(request.path("category").asText());
			book.setEdition(request.path("edition").asText());
			book.setRack(request.path("rack").asText());
			book.setTitle(request.path("title").asText());
			book.setIsdn(request.path("isdn").asText());
			
			Book bookDb = bookRepository.save(book);
			
			//Add Inventory
			Inventory inventory = new Inventory();
			
			inventory.setBookId(bookDb.getBookId());
			inventory.setUserId(userId);
			inventory.setStatus(LibraryConstants.STATUS_AVAILABLE);
			
			
		}
		
		return response;
	}
	
}
