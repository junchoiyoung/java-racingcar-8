package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchWinner {
    public static List<String> search(CarsList carsList) {
        int maxDistance = searchMaxDistance(carsList);
        List<String> winner = findWinner(carsList, maxDistance);

        return Collections.unmodifiableList(winner);
    }

    private static int searchMaxDistance(CarsList carsList) {
        int maxDistance = 0;

        for (Car car : carsList.getCarsList()) {
            int distance = car.getDistance();
            if (maxDistance < distance) {
                maxDistance = distance;
            }
        }

        return maxDistance;
    }

    private static List<String> findWinner(CarsList carsList, int maxDistance) {
        List<String> winner = new ArrayList<>();

        for (Car car : carsList.getCarsList()) {
            if (maxDistance == car.getDistance()) {
                winner.add(car.getName());
            }
        }

        return winner;
    }
}
