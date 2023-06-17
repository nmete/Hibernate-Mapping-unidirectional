package onetooneuni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
    @Id
    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AdharCard getAdharCard() {
        return adharCard;
    }

    public void setAdharCard(AdharCard adharCard) {
        this.adharCard = adharCard;
    }

    private String name;

    private String city;

    @OneToOne
    private AdharCard adharCard;

}
