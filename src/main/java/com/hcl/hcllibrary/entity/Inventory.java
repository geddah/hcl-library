package com.hcl.hcllibrary.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	private Long inventoryId;

	@Column(name = "BOOK_ID")
	private Long bookId;

	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "DATE_BORROWED")
	private Date dateBorrow;
	
	@Column(name = "DATE_OF_RETURN")
	private Date datOfReturn;

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateBorrow() {
		return dateBorrow;
	}

	public void setDateBorrow(Date dateBorrow) {
		this.dateBorrow = dateBorrow;
	}

	public Date getDatOfReturn() {
		return datOfReturn;
	}

	public void setDatOfReturn(Date datOfReturn) {
		this.datOfReturn = datOfReturn;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", bookId=" + bookId + ", userId=" + userId + ", status="
				+ status + ", dateBorrow=" + dateBorrow + ", datOfReturn=" + datOfReturn + "]";
	}

}
