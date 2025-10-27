package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.model.Car;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_이름_출력_테스트() {
        Car car = new Car("pobi");

        assertThat(car.getName()).isEqualTo("pobi");
    }

    @Test
    void 자동차_주행거리_출력_테스트() {
        Car car = new Car("pobi");

        car.updateDistance();

        assertThat(car.getDistance()).isEqualTo(1);
    }
}
