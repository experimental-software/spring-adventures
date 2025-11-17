package com.experimental_software.spring_adventures.production;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.experimental_software.spring_adventures.production.ProductInventory.ProductInventoryId;

import jakarta.transaction.Transactional;

@Repository
@Transactional
interface ProductInventoryRepository extends JpaRepository<ProductInventory, ProductInventoryId> {

    @EntityGraph(value = "ProductInventory.product")
    List<ProductInventory> findTop3By(Pageable pageable);
}
