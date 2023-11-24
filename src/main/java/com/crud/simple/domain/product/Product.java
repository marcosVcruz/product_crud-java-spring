package com.crud.simple.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    public Product(RequestProductDTO requestProductDTO){
        this.name = requestProductDTO.name();
        this.description = requestProductDTO.description();
        this.price = requestProductDTO.price();
    }
}
