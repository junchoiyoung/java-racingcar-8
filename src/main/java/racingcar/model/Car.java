package racingcar.model;

public class Car {
    private final String name;
    private String movement;

    public Car(String name) {
        this.name = name;
        this.movement = "";
    }

    public String getMovement() {
        return movement;
    }

    public void move() {
        movement = movement.concat("-");
    }

    public String getName() {
        return name;
    }
}
