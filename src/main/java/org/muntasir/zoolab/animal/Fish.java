package org.muntasir.zoolab.animal;

import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.DefaultSwimmer;
import org.muntasir.zoolab.Swimmer;

public class Fish extends Animal implements Swimmer {

    private String color;
    private boolean large;

    private DefaultSwimmer defaultSwimmer = new DefaultSwimmer();

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
        return defaultSwimmer.swim();
    }


}
