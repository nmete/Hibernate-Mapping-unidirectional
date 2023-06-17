package manytooneuni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card1 {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    int id;

}
