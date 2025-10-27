package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RoundManager {
    private static final int RANDOM_MIN_VALUE = 0;
    private static final int RANDOM_MAX_VALUE = 9;
    private static final int MOVE_CONDITION_VALUE = 4;


    CarsList carsList;

    public RoundManager(CarsList carsList) {
        this.carsList = carsList;
    }

    public void playOneRound() {
        for (Car car : carsList.getCarsList()) {
            int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_VALUE, RANDOM_MAX_VALUE);
            if (randomNumber >= MOVE_CONDITION_VALUE) {
                car.updateDistance();
            }
        }
    }
}
