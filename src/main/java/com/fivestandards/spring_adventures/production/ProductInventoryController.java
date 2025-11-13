package com.fivestandards.spring_adventures.production;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@Tag(name = "Product Inventories")
class ProductInventoryController {

    private final ProductInventoryRepository productInventoryRepository;

    @GetMapping(path = "/api/product-inventories/top3")
    public ResponseEntity<List<ProductInventory>> getProductInventories(Pageable pageable) {
        List<ProductInventory> productInventories = productInventoryRepository.findTop3By(pageable);
        return ResponseEntity.ok(productInventories);
    }
}
