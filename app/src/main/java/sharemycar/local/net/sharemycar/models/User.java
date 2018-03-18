package sharemycar.local.net.sharemycar.models;

/**
 * Created by ferna on 14/03/2018.
 */

public class User {

    //attributes
    private Student user;
    private Car car;
    private Student driver;

    //getters and setters
    public Student getUser() {
        return user;
    }

    public void setUser(Student user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Student getDriver() {
        return driver;
    }

    public void setDriver(Student driver) {
        this.driver = driver;
    }

    //constructor
    public User() {
        this.user = new Student();
        this.car = new Car();
        this.driver = new Student();
    }

    public User(Student user, Car car, Student driver) {
        this.user = user;
        this.car = car;
        this.driver = driver;
    }
}
