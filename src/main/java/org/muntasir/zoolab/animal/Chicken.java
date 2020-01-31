package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;

public class Chicken extends Bird {

    public static final String CLUCK = "Cluck, cluck";
    public static final String DOODLE = "Cock-a-doodle-doo";

    private String sound;
    private final Sex sex;

    public Chicken() {
        this.sound = CLUCK;
        this.sex = Sex.FEMALE;
    }

    public Chicken(boolean rooster) {
        this.sound = rooster ? DOODLE : CLUCK;
        this.sex = rooster ? Sex.MALE : Sex.FEMALE;
    }

    public String sing() {
        System.out.println("I am singing " + sound);
        return sound;
    }

    public Action fly() throws ActionException {
        String reason = "Unable to fly, the wings are clipped";
        System.err.println(reason);
        throw new ActionException(Action.FLY, reason);
    }

    public Sex getSex() {
        return sex;
    }

    public String getSound() {
        return sound;
    }
}
