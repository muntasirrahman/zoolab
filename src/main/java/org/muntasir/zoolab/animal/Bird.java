package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.Flyer;
import org.muntasir.zoolab.Walker;

public class Bird extends Animal implements Walker, Flyer, SoundEmitter {

    public static final String SING = "Sing";

    public Action walk() {
        System.out.println("I am walking");
        return Action.WALK;
    }

    public Action fly() throws ActionException {
        System.out.println("I am flying");
        return Action.FLY;
    }

    public String sing() {
        System.out.println("I am singing");
        return SING;
    }
}
