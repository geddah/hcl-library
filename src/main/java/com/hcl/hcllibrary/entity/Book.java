package com.hcl.hcllibrary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "BOOK")
public class Book {

	@Column(name = "isdn")
	private String isdn;
	@Id
	private Long bookId;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "category")
	private String category;

	@Column(name = "edition")
	private String edition;

	@Column(name = "rack")
	private String rack;

	public String getIsdn() {
		return isdn;
	}

	public void setIsdn(String isdn) {
		this.isdn = isdn;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getRack() {
		return rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	@Override
	public String toString() {
		return "Book [isdn=" + isdn + ", bookId=" + bookId + ", title=" + title + ", author=" + author + ", category="
				+ category + ", edition=" + edition + ", rack=" + rack + "]";
	}

}
