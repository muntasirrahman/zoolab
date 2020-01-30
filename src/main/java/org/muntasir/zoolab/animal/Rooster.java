package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;

public class Rooster extends Bird {

    public static final String DOODLE = "Cock-a-doodle-doo";

    public String sing() {
        return DOODLE;
    }

    public Action fly() throws ActionException {
        String reason = "Unable to fly, the wings are clipped";
        System.err.println(reason);
        throw new ActionException(Action.FLY, reason);
    }

}
