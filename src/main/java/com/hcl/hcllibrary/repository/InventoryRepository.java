package com.hcl.hcllibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.hcllibrary.entity.Inventory;


@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	
	List<Inventory> findByBookIdAndUserId(Long bookId, Long userId);
	
	@Query("SELECT i FROM INVENTORY i WHERE i.bookId = :bookId AND i.userId = :userId AND i.status = 'AVAILABLE'")
	Inventory findAvailableByBookIdAndUserId(@Param("bookId") Long bookId, @Param("userId") Long userId);
	
	
}
