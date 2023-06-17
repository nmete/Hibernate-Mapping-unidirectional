package manytomany.test;

import manytomany.dto.Courses;
import manytomany.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ManyToManyTest {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        Courses courses= new Courses();
        courses.setId(1);
        courses.setCname("rest api");

        Courses courses1= new Courses();
        courses1.setId(2);
        courses1.setCname("ITI");

        Courses courses2= new Courses();
        courses2.setId(3);
        courses2.setCname("java");

        Student student=new Student();
        student.setId(101);
        student.setName("ram");

        List <Courses> list1=new ArrayList<Courses>();
        list1.add(courses1);
        list1.add(courses2);

        student.setCourses(list1);


        Student student1=new Student();
        student1.setId(101);
        student1.setName("rakesh");

        List <Courses> list2=new ArrayList<Courses>();
        list2.add(courses);
        list2.add(courses1);
        list2.add(courses2);

        student1.setCourses(list2);

        entityTransaction.begin();
        entityManager.merge(courses);
        entityManager.merge(courses1);
        entityManager.merge(courses2);
        entityManager.merge(student);
        entityManager.merge(student1);
        entityTransaction.commit();


    }
}
