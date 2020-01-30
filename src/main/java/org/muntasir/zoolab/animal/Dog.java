package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.Walker;

public class Dog implements Walker, SoundEmitter {

    public static final String WOOF = "Woof, woof";

    @Override
    public Action walk() {
        return Action.WALK;
    }

    public String sing() {
        System.out.println("I am barking " + WOOF);
        return WOOF;
    }

}
