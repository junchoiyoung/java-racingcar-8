package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Round {
    List<Car> carNameList = new ArrayList<>();
    StringBuilder stringBuilder;

    // static으로 처리함
    public void makeCarNameList(String carsName) {
        String[] carNameSplit = carsName.split(",");

        for (String carName : carNameSplit) {
            Car car = new Car(carName);
            carNameList.add(car);
        }
    }

    public String start() {
        stringBuilder = new StringBuilder();

        for (Car car : carNameList) {
            int randomNum = Randoms.pickNumberInRange(0, 10);

            if (randomNum > 3) {
                car.move();
            }

            stringBuilder.append(car.getName()).append(" : ");
            stringBuilder.append(car.getMovement());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public String searchWinner() {
        List<String> winnerList = new ArrayList<>();
        int mostGOMovement = 0;

        for (Car car : carNameList) {
            String statement = car.getMovement();
            int statementLength = statement.length();

            if (statementLength > mostGOMovement) {
                mostGOMovement = statementLength;
            }
        }

        for (Car car : carNameList) {
            String statement = car.getMovement();
            int statementLength = statement.length();

            if (mostGOMovement == statementLength) {
                winnerList.add(car.getName());
            }
        }

        return String.join(", ", winnerList);
    }
}
