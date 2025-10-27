package racingcar.exception;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RacingException {
    private final static int MAXIMUM_CAR_NAME_LENGTH = 5;
    private final static String BLANK_ERROR_MASSAGE = "문자가 비어있습니다";
    private final static String INVALID_NUM_INPUT_MASSAGE = "숫자가 아닙니다";
    private final static String INVALID_CAR_NAME_LENGTH_MASSAGE = "자동차 이름 길이 초과입니다";
    private final static String DUPLICATE_NAME_ERROR_MASSAGE = "자동차 이름이 중복됩니다.";

    private RacingException() {
    }

    public static void validateNotBlank(String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException(BLANK_ERROR_MASSAGE);
        }
    }

    public static void hasNotInt(String value) {
        try {
            Integer.parseInt(value);
        } catch (Exception e) {
            throw new IllegalArgumentException(INVALID_NUM_INPUT_MASSAGE);
        }
    }

    public static void validateNameLength(String name) {
        if (name.length() > MAXIMUM_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(INVALID_CAR_NAME_LENGTH_MASSAGE);
        }
    }

    public static void validateNoDuplicate(String[] carsNameArray) {
        Set<String> carsNameSet = new HashSet<>(List.of(carsNameArray));

        int beforeSize = carsNameArray.length;
        int afterSize = carsNameSet.size();

        if (beforeSize != afterSize) {
            throw new IllegalArgumentException(DUPLICATE_NAME_ERROR_MASSAGE);
        }
    }
}
