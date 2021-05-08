package com.hcl.hcllibrary.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/book")
public class BookController {

	@PostMapping(name = "/borrow")
	public ResponseEntity<Object> borrowBook() {
		return null;
	}

	@GetMapping(name = "/search")
	public ResponseEntity<Object> searchBook(@RequestParam("title") String title, @RequestParam("author") String author,
			@RequestParam("category") String category) {
		return null;
	}

}
