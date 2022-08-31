package hiber.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "car")
public class Car implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User user;



    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private  int series;

    public Car() {

    }

    public Car(int series, String model) {
        this.model = model;
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
