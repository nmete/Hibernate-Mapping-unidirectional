package onetooneuni.test;

import onetooneuni.dto.AdharCard;
import onetooneuni.dto.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonAdharTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        Person person= new Person();
        person.setPid(1);
        person.setName("neha");
        person.setCity("laur in maharastra");

        AdharCard adharCard= new AdharCard() ;
        adharCard.setId(1);
        adharCard.setAddress("near hdbcaiupweg");
        adharCard.setName("neha mete");

        person.setAdharCard(adharCard);

        entityTransaction.begin();

        entityManager.persist(person);
        entityManager.persist(adharCard);
        entityTransaction.commit();
    }



}
