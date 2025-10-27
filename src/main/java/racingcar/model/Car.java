package racingcar.model;

import racingcar.exception.RacingException;

public class Car {
    private static final int MIN_CAR_NAME_LENGTH = 0;

    private final String name;
    private int distance;

    public Car(String name) {
        RacingException.validateNotBlank(name);
        RacingException.validateNameLength(name);
        this.name = name;
        this.distance = MIN_CAR_NAME_LENGTH;
    }

    public void updateDistance() {
        distance++;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
