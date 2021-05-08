package com.hcl.hcllibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.hcllibrary.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
