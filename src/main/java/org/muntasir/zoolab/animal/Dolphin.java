package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.DefaultSwimmer;
import org.muntasir.zoolab.Swimmer;

public class Dolphin implements Swimmer {

    private DefaultSwimmer defaultSwimmer = new DefaultSwimmer();

    @Override
    public Action swim() {
        return defaultSwimmer.swim();
    }
}
