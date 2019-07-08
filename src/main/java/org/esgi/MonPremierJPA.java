package org.esgi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public  class MonPremierJPA {

    public  static  void main(String... args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test") ;

        EntityManager em = emf.createEntityManager() ;

        Book book =  new Book() ;
        book.setTitle("mon 1er livre");
        em.getTransaction().begin() ;
        em.persist(book) ;
        em.getTransaction().commit() ;

        System.out.println("Id = " + book.getId()) ;



    }
}