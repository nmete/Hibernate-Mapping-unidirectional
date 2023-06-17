package manytomany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Courses {

    @Id
    int id;

    String cname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
