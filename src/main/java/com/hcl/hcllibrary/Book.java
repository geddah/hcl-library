package com.hcl.library.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long books_ISDN;
    private String uUID;
    private String title;
    private String author;
    private String category;
    private String edition;
    private String rack_No;

    public Long getBooks_ISDN() {
        return books_ISDN;
    }

    public void setBooks_ISDN(Long books_ISDN) {
        this.books_ISDN = books_ISDN;
    }

    public String getuUID() {
        return uUID;
    }

    public void setuUID(String uUID) {
        this.uUID = uUID;
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

    public String getRack_No() {
        return rack_No;
    }

    public void setRack_No(String rack_No) {
        this.rack_No = rack_No;
    }

    @Override
    public String toString() {
        return "Book{" +
                "books_ISDN=" + books_ISDN +
                ", uUID='" + uUID + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", edition='" + edition + '\'' +
                ", rack_No='" + rack_No + '\'' +
                '}';
    }
}
