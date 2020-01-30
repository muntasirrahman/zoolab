package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;

public class Bird extends Animal {

    public static final String SING = "Sing";

    public Action fly() throws ActionException {
        System.out.println("I am flying");
        return Action.FLY;
    }

    public String sing() {
        System.out.println("I am singing");
        return "Sing";
    }
}
