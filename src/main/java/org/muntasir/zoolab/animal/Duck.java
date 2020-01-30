package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.Swimmer;

public class Duck extends Bird implements Swimmer {

    public static final String QUACK = "Quack, quack";

    public String sing() {
        System.out.println("I am singing " + QUACK);
        return QUACK;
    }


    @Override
    public Action swim() {
        System.out.println("I am swimming");
        return Action.SWIM;
    }
}
