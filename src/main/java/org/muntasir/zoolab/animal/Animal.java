package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;

public class Animal implements SoundEmitter {

    public Action walk() {
        System.out.println("I am walking");
        return Action.WALK;
    }

    @Override
    public String sing() {
        return "Sound";
    }
}
