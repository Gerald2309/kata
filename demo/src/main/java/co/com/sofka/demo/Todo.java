package co.com.sofka.demo;
import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean isComplete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
