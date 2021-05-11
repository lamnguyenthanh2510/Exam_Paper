package com.tuananh.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(name ="name")
    private String name;

    @OneToMany(mappedBy = "category" , fetch = FetchType.LAZY)
    List<ProductEntity> products;

    public CategoryEntity(int id, String name, List<ProductEntity> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public CategoryEntity() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }
}
