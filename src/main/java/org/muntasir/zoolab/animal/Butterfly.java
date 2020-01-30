package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.*;

public class Butterfly implements Flyer, SoundEmitter, Walker {

    private boolean butterflyMode = false;
    private String mode = "CATERPILLAR";
    private DefaultFlyer defaultFlyer;

    private Butterfly() {
        //every butterfly must start from Caterpillar
    }

    public static Butterfly bornAsCaterpilllar() {
        return new Butterfly();
    }

    @Override
    public String sing() {
        return ""; // silent
    }

    @Override
    public Action fly() throws ActionException {
        if (defaultFlyer == null) {
            System.err.println("I can't fly");
            throw new ActionException(Action.FLY, "I don't have wing");
        }
        return defaultFlyer.fly();
    }

    @Override
    public Action walk() {
        return Action.WALK;
    }

    public void metamorph() {
        System.out.println("I undergo metamorphosis");
        butterflyMode = true;
        mode = "BUTTERFLY";
        defaultFlyer = new DefaultFlyer();
        System.out.println("Metamorphosis is done");
    }

    public String getMode() {
        return mode;
    }

    public boolean isButterflyMode() {
        return butterflyMode;
    }
}
