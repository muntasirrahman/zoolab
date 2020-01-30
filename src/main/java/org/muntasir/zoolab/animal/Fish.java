package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.Swimmer;

public class Fish implements Swimmer {

    @Override
    public Action swim() {
        return Action.SWIM;
    }
}
