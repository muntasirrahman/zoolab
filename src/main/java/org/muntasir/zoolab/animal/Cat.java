package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.Walker;

public class Cat implements Walker, SoundEmitter {

    public static final String MEOW = "Meow";

    public String sing() {
        System.out.println("I am meow " + MEOW);
        return MEOW;
    }

    @Override
    public Action walk() {
        return Action.WALK;
    }
}
