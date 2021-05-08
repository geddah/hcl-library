package com.hcl.hcllibrary.Repository;


import com.hcl.hcllibrary.entity.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    public List<Book> findByItem(String item);

    @Query("SELECT * FROM Books b WHERE b.books_ISDN = :books_ISDN AND b.title  = :title")
    public Book getBooksByIDandTitle(@Param("id") Long books_ISDN, @Param("title") String title);

    @Query("Select * from Users where Users.custId=:custId")
    public Users checkCustomerIsPresentOrNo(@Param("custId") Long custId);

    @Query("insert into table Inventory (bookId,custId) values (:bookId,:custId)")
    public boolean insertIntoCatalogEntryTable(@Param("bookId") Long bookId, @Param("custId") String custId);


}
