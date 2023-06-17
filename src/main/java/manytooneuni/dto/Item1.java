package manytooneuni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "shoppingItem")
public class Item1 {

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

    public Card1 getCard() {
        return card;
    }

    public void setCard(Card1 card) {
        this.card = card;
    }

    @Id
    int id;

    String name;

    @ManyToOne
    Card1 card;
}
