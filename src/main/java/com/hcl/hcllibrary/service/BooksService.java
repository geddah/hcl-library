package com.hcl.hcllibrary.service;

import com.hcl.hcllibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BooksService {

    @Autowired
    BookRepository bookRepo;

    public void loanBook(Long bookId, String userId, Long custId) throws Exception {


        if (bookRepo.insertIntoCatalogEntryTable(bookId, userId)) {
            throw new Exception("Unable to dispatch the book");
        }


    }
}
