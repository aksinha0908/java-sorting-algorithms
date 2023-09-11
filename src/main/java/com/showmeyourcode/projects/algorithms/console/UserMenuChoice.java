package com.showmeyourcode.projects.algorithms.console;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum UserMenuChoice {
    BAD_USER_INPUT(0),
    ALGORITHM_1(1),
    ALGORITHM_2(2),
    ALGORITHM_3(3),
    ALGORITHM_4(4),
    ALGORITHM_5(5),
    ALGORITHM_6(6),
    ALGORITHM_7(7),
    ALGORITHM_8(8),
    ALGORITHM_9(9),
    BENCHMARK(10),
    GENERATE_DATASET(11),
    EXIT(12);

    private static final Map<Integer, UserMenuChoice> enumMap = new HashMap<>(values().length, 1);

    static {
        for (UserMenuChoice c : values()) enumMap.put(c.getUserChoice(), c);
    }

    private final int userChoice;

    UserMenuChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public static int getHighestAvailableUserChoice() {
        return enumMap.values().stream().map(UserMenuChoice::getUserChoice).max(Integer::compareTo).get();//NOSONAR
    }

    public int getUserChoice() {
        return userChoice;
    }

    public static Optional<UserMenuChoice> of(int userChoice) {
        return Optional.ofNullable(enumMap.get(userChoice));
    }
}
