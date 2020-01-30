package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;

public class Duck extends Bird {

    public static final String QUACK = "Quack, quack";

    public String sing() {
        System.out.println("I am singing " + QUACK);
        return QUACK;
    }

    public Action swim() {
        System.out.println("I am swimming");
        return Action.SWIM;
    }
}
