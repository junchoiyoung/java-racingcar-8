package racingcar;

import racingcar.controller.RaceController;
import racingcar.model.Round;
import racingcar.view.RacingView;

public class Application {
    public static void main(String[] args) {
        RacingView racingView = new RacingView();
        Round round = new Round();
        RaceController raceController = new RaceController(racingView, round);

        raceController.play();
    }
}
