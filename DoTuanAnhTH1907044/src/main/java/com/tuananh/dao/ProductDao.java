package com.tuananh.dao;

import com.tuananh.model.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProductDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertProduct(ProductEntity product) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.close();
    }

    public void updateProduct(ProductEntity product) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        ProductEntity productUpdate = em.find(ProductEntity.class, product.getId());
        if (productUpdate != null) {
            productUpdate.setName(product.getName());
            productUpdate.setBrand(product.getBrand());
            productUpdate.setDescribes(product.getDescribes());
            productUpdate.setPrice(product.getPrice());

        }
        em.getTransaction().commit();
        em.close();
    }

    public void deleteProduct(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        ProductEntity productUpdate = em.find(ProductEntity.class, id);
        if (productUpdate != null){
            em.remove(productUpdate);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<ProductEntity> getAllProduct() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<ProductEntity> list = em.createQuery("select c from ProductEntity c", ProductEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

}
