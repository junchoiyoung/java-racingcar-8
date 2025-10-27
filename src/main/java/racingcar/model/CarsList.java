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

        // 자동차 이름 중복일 경우 추가
        for (String carName : carsNameArray) {
            carName = carName.trim();
            carNameList.add(new Car(carName));
        }
    }

    public List<Car> getCarsList() {
        return Collections.unmodifiableList(carNameList);
    }
}
