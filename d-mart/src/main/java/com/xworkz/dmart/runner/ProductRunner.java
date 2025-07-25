package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductRunner {
    public static void main(String[] args) {

        //ProductEntity productEntity=new ProductEntity("Tea",28d,"25-07-2025","x-workz");

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("x-workz");

        EntityManager entityManager= entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction= entityManager.getTransaction();

        entityTransaction.begin();
//        entityManager.persist(productEntity);
//        entityTransaction.commit();
    }
}
