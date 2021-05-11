package com.tuananh.model;

import javax.persistence.*;
import javax.persistence.metamodel.ListAttribute;
import java.util.List;

@Entity
@Table{name = "product"}
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name="price")
    private int price;

    @Column(name="brand")
    private String brand;

    @Column(name="describes")
    private String describes;

    @ManyToOne()
    @JoinColumn(name="brand", insertable = false , updatable = false)
    private CategoryEntity category;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_atribute",
              joinColumns = @JoinColumn(name="product_id"),
    inverseJoinColumns = @JoinColumn(name = "attribute_id")
    )

    private List<AttributeEntity> attributes;
}
