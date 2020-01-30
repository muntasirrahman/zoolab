package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;

public class Shark extends Fish {

    public Shark() {
        super("GREY", true);
    }

    public Action eat(Fish fish) {
        return Action.EAT;
    }
}
