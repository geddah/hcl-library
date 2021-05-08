package com.hcl.hcllibrary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	private Long inventoryId;

	
	private Long bookId;

	private String userId;
	private String status;
	private String date_borrow;
	private String date_return;
	private String total_fees;

	
}
