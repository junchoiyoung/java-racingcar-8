package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.model.Car;
import racingcar.model.CarsList;

public class RacingView {

    public void printCarNamePrompt() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printCountPrompt() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public String readData() {
        return Console.readLine();
    }

    public void showRoundResult(CarsList carsList) {
        for (Car car : carsList.getCarsList()) {
            System.out.print(car.getName() + " : ");
            System.out.println("-".repeat(car.getDistance()));
        }
        System.out.println("\n");
    }

    public void showWinner(List<String> winner) {
        System.out.print("최종 우승자 : ");
        System.out.println(String.join(",", winner));
    }
}
