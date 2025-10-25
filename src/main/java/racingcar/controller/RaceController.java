package racingcar.controller;

import racingcar.model.Round;
import racingcar.view.RacingView;

public class RaceController {
    RacingView racingView;
    Round round;

    public RaceController(RacingView racingView, Round round) {
        this.racingView = racingView;
        this.round = round;
    }

    public void play() {
        racingView.printCarNamePrompt();
        String carNames = racingView.readData();

        racingView.printCountPrompt();
        String roundCount = racingView.readData();

        round.makeCarNameList(carNames);

        long count = Integer.parseInt(roundCount);
        for (int i = 0; i < count; i++) {
            String result = round.start();
            racingView.showRoundResult(result);
        }

        String winner = round.searchWinner();
        racingView.showWinner(winner);
    }
}
