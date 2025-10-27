package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.exception.RacingException;

public class CarsList {
    private final List<Car> carNameList = new ArrayList<>();

    public CarsList(String carsName) {
        RacingException.validateNotBlank(carsName);

        String[] carsNameArray = carsName.split(",");
        RacingException.validateNoDuplicate(carsNameArray);

        for (String carName : carsNameArray) {
            carName = carName.trim();
            carNameList.add(new Car(carName));
        }
    }

    public List<Car> getCarsList() {
        return Collections.unmodifiableList(carNameList);
    }
}
