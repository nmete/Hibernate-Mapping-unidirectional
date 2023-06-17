package manytomany.dto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    int id;

    String name;

    @ManyToMany
    List<Courses> courses;

    @ManyToMany
    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
