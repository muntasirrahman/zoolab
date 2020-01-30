package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.Flyer;

public class Butterfly implements Flyer, SoundEmitter {

    @Override
    public String sing() {
        return ""; // silent
    }

    @Override
    public Action fly() throws ActionException {
        return Action.FLY;
    }
}
