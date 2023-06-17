package onetooneuni.dao;

import onetooneuni.dto.AdharCard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdharDao {

    public EntityManager getEntityManager(){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= entityManagerFactory.createEntityManager();
        return manager;
    }

    public AdharCard FindAdharCard(int id){
         EntityManager manager = getEntityManager();
         AdharCard card = manager.find(AdharCard.class, id);
         return card;
    }
}
