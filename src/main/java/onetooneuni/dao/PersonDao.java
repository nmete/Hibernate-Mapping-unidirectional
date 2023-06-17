package onetooneuni.dao;

import onetooneuni.dto.AdharCard;
import onetooneuni.dto.Person;

import javax.persistence.*;
import java.util.List;

public class PersonDao {

    public EntityManager getEntityManager(){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= entityManagerFactory.createEntityManager();
        return manager;
    }

    public void savePerson(Person person, AdharCard adharCard){
        EntityManager manager= getEntityManager();
        EntityTransaction entityTransaction= manager.getTransaction();

        entityTransaction.begin();
        manager.persist(person);
        manager.persist(adharCard);
        entityTransaction.commit();
    }

    public void updatePerson(Person person, AdharCard adharCard){
        EntityManager manager= getEntityManager();
        EntityTransaction entityTransaction= manager.getTransaction();

        entityTransaction.begin();
        manager.merge(person);
        manager.merge(adharCard);
        entityTransaction.commit();
    }

    public Person findperson(int id){
        EntityManager entityManager= getEntityManager();
        Person person= entityManager.find(Person.class, id);
        return person;
    }
    public void deletePerson(int id){
        EntityManager manager= getEntityManager();
        EntityTransaction entityTransaction= manager.getTransaction();

        entityTransaction.begin();
        manager.remove(findperson(id));
        entityTransaction.commit();
    }

    public Person findPersonByName(String name) {
        EntityManager manager = getEntityManager();
        Query query = manager.createQuery("select s from Person s where s.name=?1", Person.class);

        query.setParameter(1, name);
        Person person = (Person) query.getSingleResult();

        return person;
    }

}
