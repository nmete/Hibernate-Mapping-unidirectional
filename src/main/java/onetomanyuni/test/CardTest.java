package onetomanyuni.test;

import onetomanyuni.dto.Card;
import onetomanyuni.dto.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class CardTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();


        Item i1= new Item();
        i1.setId(1);
        i1.setName("Head phone");


        Item i2= new Item();
        i2.setId(2);
        i2.setName("watch");

        Item i3= new Item();
        i3.setId(3);
        i3.setName("one Plus");

        Card card= new Card();

        List<Item> list= null;
        list.add(i1);
        list.add(i2);
        list.add(i3);



        card.setId(1);
        card.setItems(list);

        entityTransaction.begin();
        entityManager.persist(card);
        entityTransaction.commit();

    }
}
