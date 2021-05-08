package com.hcl.hcllibrary.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping(name = "/search")
	public ResponseEntity<Object> searchBook(@RequestParam("title") String title, @RequestParam("author") String author,
			@RequestParam("category") String category) {
		return null;
	}

}
