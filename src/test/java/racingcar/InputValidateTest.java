package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.controller.RaceController;
import racingcar.model.CarsList;
import racingcar.view.RacingView;

import static org.assertj.core.api.Assertions.*;

public class InputValidateTest {

    private final RacingView racingView = new RacingView();
    private final RaceController raceController = new RaceController(racingView);

    @Test
    void 자동차_이름_공백_테스트() {
        assertThatThrownBy(() -> new CarsList(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름_길이_제한_테스트() {
        assertThatThrownBy(() -> new CarsList("pobi,woni,woteco"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름_중복_테스트() {
        assertThatThrownBy(() -> new CarsList("pobi,woni,pobi"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름중_빈_문자열_테스트() {
        assertThatThrownBy(() -> new CarsList("pobi, ,woni"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 라운드_횟수_공백_테스트() {
        assertThatThrownBy(() -> raceController.validateRoundCount(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 라운드_횟수_문자_입력() {
        assertThatThrownBy(() -> raceController.validateRoundCount("xyz"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 라운드_정상_횟수_테스트() {
        int roundCount = raceController.validateRoundCount("5");
        assertThat(roundCount).isEqualTo(5);
    }
}
