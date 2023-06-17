package manytooneuni.test;

import manytooneuni.dto.Card1;
import manytooneuni.dto.Card1;
import manytooneuni.dto.Item1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class manytooneTest {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        Card1 card= new Card1();
        card.setId(101);

        Item1 item1= new Item1();
        item1.setId(1);
        item1.setName("head phone");
        item1.setCard(card);

        Item1 item12 = new Item1();
        item12.setId(2);
        item12.setName("Iphone");
        item12.setCard(card);

        Item1 item13 = new Item1();
        item13.setId(3);
        item13.setName("earings ");
        item13.setCard(card);


       entityTransaction.begin();
       entityManager.persist(item1);
        entityManager.persist(item12);
        entityManager.persist(item13);

        entityManager.persist(card);
       entityTransaction.commit();
    }
}
