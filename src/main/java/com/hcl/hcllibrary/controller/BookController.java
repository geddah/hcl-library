package com.hcl.hcllibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.hcl.hcllibrary.service.BorrowBook;

@RestController("/book")
public class BookController {

	@Autowired
	private BorrowBook borrowBook;
	
	@PostMapping(name = "/borrow")
	public ResponseEntity<Object> borrowBook(@RequestBody JsonNode request ) {
		return borrowBook.borrowBook(request);
	}


}
