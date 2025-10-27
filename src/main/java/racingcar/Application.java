package racingcar;

import racingcar.controller.RaceController;
import racingcar.view.RacingView;

public class Application {
    public static void main(String[] args) {
        RacingView racingView = new RacingView();
        RaceController raceController = new RaceController(racingView);

        raceController.play();
    }
}
