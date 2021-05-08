package com.hcl.hcllibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.hcl.hcllibrary.entity.Book;
import com.hcl.hcllibrary.service.AddBook;

@RestController("/inventory")
public class InventoryController {

	@Autowired
	private AddBook addBook;
	
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody JsonNode request){
		return addBook.addBook(request);
	}
	
}
