package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;

public class ClownFish extends Fish {

    public ClownFish() {
        super("ORANGE", false);
    }

    public Action makeJokes() {
        return Action.MAKE_JOKES;
    }
}
