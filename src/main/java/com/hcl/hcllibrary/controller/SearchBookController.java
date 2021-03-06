package com.hcl.hcllibrary.controller;

import static com.hcl.hcllibrary.utils.ServiceConstants.API_GET_BOOKS;
import static com.hcl.hcllibrary.utils.ServiceConstants.API_LOAN_BOOK;
import static com.hcl.hcllibrary.utils.ServiceConstants.BOOKS_ISDN;
import static com.hcl.hcllibrary.utils.ServiceConstants.CUSTID;
import static com.hcl.hcllibrary.utils.ServiceConstants.TITLE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.hcl.library.repository.BookRepo;
//import com.hcl.library.service.LoanService;
import com.hcl.hcllibrary.entity.Book;
import com.hcl.hcllibrary.repository.BookRepository;
import com.hcl.hcllibrary.service.BooksService;


@RestController
public class SearchBookController {

    @Autowired
    BookRepository bookRepo;

    @Autowired
    BooksService booksService;

    @RequestMapping(value = API_GET_BOOKS,
            method = RequestMethod.GET,
            produces = {"application/json"})
    public Book getBooksByIDandTitle(@RequestParam(value = BOOKS_ISDN) Long bookId,
                                     @RequestParam(value = TITLE) String title) {

        return bookRepo.getBooksByIDandTitle(bookId, title);

    }

    @RequestMapping(value = API_LOAN_BOOK,
            method = RequestMethod.GET,
            produces = {"application/json"})
    public void loanBooksByIDandTitle(@RequestParam(value = "bookId") Long bookId,
                                      @RequestParam(value = "userId") String userId,
                                      @RequestParam(value = CUSTID) Long custId) throws Exception {

        booksService.loanBook(bookId, userId, custId);

    }
}
