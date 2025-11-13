package com.fivestandards.spring_adventures.production;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product", schema = "production")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @Column(name = "productid")
    private Integer productId;

    @Column(name = "productnumber")
    private String productNumber;

    @Column(name = "name")
    private String name;


}
