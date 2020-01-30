package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.Walker;

public class Frog extends Animal implements Walker, SoundEmitter {

    public static final String CROAK = "RIBIT";

    @Override
    public String sing() {
        return CROAK;
    }

    @Override
    public Action walk() {
        return Action.WALK;
    }
}
