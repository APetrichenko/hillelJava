package com.alexey.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


/**
 * Created by NewClass7 on 25.09.2015.
 */
public class App {

    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        Book book  = new Book();
        book.setTitle("Some title");
        book.setPrice(2.3F);
        book.setDescription("Some description");
        book.setIsbn("some isbn");
        book.setNumOfPages(234);
        book.setIllustrations(false);
        book.getTags().add("nice book");
        book.getTags().add("very nice");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("book");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(book);
        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    public static void getAndPrint() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Book foundBook = entityManager.getReference(Book.class, 1L);
        System.out.println("__________________");
       // System.out.println(foundBook.getTags());

        entityManager.remove(foundBook);
        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();

        System.out.println(foundBook.getTags());


    }
}
