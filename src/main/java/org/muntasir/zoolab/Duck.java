package org.muntasir.zoolab;

public class Duck extends Bird {

    public static final String QUACK = "Quack, quack";

    public String sing() {
        System.out.println("I am singing " + QUACK);
        return "Sound: " + QUACK;
    }

    public Action swim() {
        System.out.println("I am swimming");
        return Action.SWIM;
    }
}
