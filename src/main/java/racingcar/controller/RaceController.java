package racingcar.controller;

import racingcar.exception.RacingException;
import racingcar.model.CarsList;
import racingcar.model.RoundManager;
import racingcar.model.SearchWinner;
import racingcar.view.RacingView;

public class RaceController {
    RacingView racingView;

    private int roundCount;
    private String carsName;
    private CarsList carsList;

    public RaceController(RacingView racingView) {
        this.racingView = racingView;
    }

    public void play() {
        inputCarName();
        inputRoundCount();
        createList();
        startRace();
        outputWinner();
    }

    private void inputCarName() {
        racingView.printCarNamePrompt();
        carsName = racingView.readData();
    }

    private void inputRoundCount() {
        racingView.printCountPrompt();
        String roundCount = racingView.readData();

        RacingException.validateNotBlank(roundCount);
        RacingException.hasNotInt(roundCount);

        this.roundCount = Integer.parseInt(roundCount);
    }

    private void createList() {
        carsList = new CarsList(carsName);
    }

    private void startRace() {
        RoundManager roundManager = new RoundManager(carsList);

        for (int i = 0; i < roundCount; i++) {
            roundManager.playOneRound();
            racingView.showRoundResult(carsList);
        }
    }

    private void outputWinner() {
        racingView.showWinner(SearchWinner.search(carsList));
    }
}
