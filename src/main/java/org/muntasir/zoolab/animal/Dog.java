package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;

public class Dog extends Animal {

    public static final String WOOF = "Woof, woof";

    public String sing() {
        System.out.println("I am barking " + WOOF);
        return WOOF;
    }

    public Action fly() throws ActionException {
        String reason = "Unable to fly, i don't have wing";
        System.err.println(reason);
        throw new ActionException(Action.FLY, reason);
    }


}
