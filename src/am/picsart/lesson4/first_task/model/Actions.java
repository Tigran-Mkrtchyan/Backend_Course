package am.picsart.lesson4.first_task.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Actions {
    SIMULATION("simulation"),
    HAND_PLAY("hand play"),
    ROUGE_PLAY("rouge play"),
    SEND_PASS("send pass"),
    SEND_LONG_PASS("send long pass"),
    SHOOT_NEAR_TARGET("shoot near target"),
    FOUL("foul"),
    TAKE_BOOL("take bool"),
    SHOOT_ON_TARGET("shoot on target"),
    TIRED("tired");

    private final String value;

    Actions(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static List<Actions> getAllActions() {
        return new ArrayList<>(Arrays.asList(Actions.values()));
    }
}
