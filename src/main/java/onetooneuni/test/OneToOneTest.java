package onetooneuni.test;

import onetooneuni.dao.AdharDao;
import onetooneuni.dao.PersonDao;
import onetooneuni.dto.AdharCard;
import onetooneuni.dto.Person;

public class OneToOneTest {

    public static void main(String[] args) {
//
//        PersonDao personDao= new PersonDao();
//
//        Person person= personDao.findPersonByName("neha");
//
//        if(person == null){
//            System.out.println("person is not present in daatabase");
//            return;
//        }
//        System.out.println(person.getName());
//        System.out.println(person.getPid());
//        System.out.println(person.getCity());
//
//        AdharCard adharCard= person.getAdharCard();
//
//        System.out.println(adharCard.getName());
//        System.out.println(adharCard.getName());

        AdharDao adharDao= new AdharDao();
        AdharCard adharcard = adharDao.FindAdharCard(12);
    }
}
