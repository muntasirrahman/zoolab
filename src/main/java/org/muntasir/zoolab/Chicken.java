package org.muntasir.zoolab;

public class Chicken extends Bird {

    public static final String CLUCK = "Cluck, cluck";

    public String sing() {
        System.out.println("I am singing " + CLUCK);
        return "Sound: " + CLUCK;
    }

    public Action fly() throws ActionException {
        String reason = "Unable to fly, the wings are clipped";
        System.err.println(reason);
        throw new ActionException(Action.FLY, reason);
    }
}
