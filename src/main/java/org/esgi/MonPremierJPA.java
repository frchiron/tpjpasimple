package org.esgi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public  class MonPremierJPA {

    public  static  void main(String... args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test") ;

        EntityManager em = emf.createEntityManager() ;

        Book book =  new Book() ;
        em.getTransaction().begin() ;
        em.persist(book) ;
        em.getTransaction().commit() ;

        System.out.println("Id = " + book.getId()) ;


        Book book1 = new Book();
        book1.setTitle("DSdsdssd");
        em.getTransaction().begin() ;
        em.persist(book1) ;

        em.getTransaction().commit() ;

        System.out.println("Id = " + book1.getId()) ;

        Book book2 = em.find(Book.class, book1.getId());
        System.out.println(book2.getTitle());

    }
}