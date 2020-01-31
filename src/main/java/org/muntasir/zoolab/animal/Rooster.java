package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;

import java.util.Locale;

public class Rooster extends Bird {

    public Rooster() {
    }

    public String sing() {
        return resourceBundle.getString("rooster");
    }

    public Action fly() throws ActionException {
        String reason = "Unable to fly, the wings are clipped";
        System.err.println(reason);
        throw new ActionException(Action.FLY, reason);
    }

}
