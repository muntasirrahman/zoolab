package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.Swimmer;

public class Fish implements Swimmer {

    private String color;
    private boolean large;

    public Fish() {
        this.color = "";
        this.large = false;
    }

    protected Fish(String color, boolean large) {
        this.color = color;
        this.large = large;
    }

    public String getColor() {
        return color;
    }

    public boolean isLarge() {
        return large;
    }

    @Override
    public Action swim() {
        return Action.SWIM;
    }


}
