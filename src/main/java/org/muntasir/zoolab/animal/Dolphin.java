package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.DefaultSwimmer;
import org.muntasir.zoolab.Swimmer;

public class Dolphin extends Animal implements Swimmer, SoundEmitter {

    private DefaultSwimmer defaultSwimmer = new DefaultSwimmer();

    public static final String CHIRPS = "Chirps";

    @Override
    public Action swim() {
        return defaultSwimmer.swim();
    }

    @Override
    public String sing() {
        return CHIRPS;
    }
}
