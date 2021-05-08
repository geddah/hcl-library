package com.hcl.hcllibrary.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.hcl.hcllibrary.entity.Inventory;
import com.hcl.hcllibrary.repository.InventoryRepository;
import com.hcl.hcllibrary.utils.LibraryConstants;

@Service
public class BorrowBook {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	public ResponseEntity borrowBook(JsonNode request) {
		ResponseEntity<Inventory> responseEntity;
		
		Long userId = request.path("userId").asLong();
		Long bookId = request.path("bookId").asLong();
		
		//Check availability
		Inventory inventory = inventoryRepository.findAvailableByBookIdAndUserId(bookId, userId);
		
		if(inventory != null) {
			//Update inventory
			inventory.setDateBorrow(new Date(System.currentTimeMillis()));
			inventory.setStatus(LibraryConstants.STATUS_BORROWED);
			inventoryRepository.save(inventory);
			responseEntity = new ResponseEntity<Inventory>(HttpStatus.OK).of(Optional.of(inventory));
		} else {
			responseEntity = new ResponseEntity<Inventory>(HttpStatus.NOT_FOUND);
		}
		
		return responseEntity;
	}
}
