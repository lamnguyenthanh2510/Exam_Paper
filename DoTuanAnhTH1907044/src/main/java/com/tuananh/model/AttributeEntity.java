package com.tuananh.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table{name="attribute"}
public class AttributeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY , mappedBy = "attributes")

    private List<ProductEntity> products;

}
