package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.Walker;

public class Animal implements SoundEmitter, Walker {

    @Override
    public Action walk() {
        System.out.println("I am walking");
        return Action.WALK;
    }

    @Override
    public String sing() {
        return "Sound";
    }
}
