package org.muntasir.zoolab;

public class Bird extends Animal {

    public Action fly() {
        System.out.println("I am flying");
        return Action.FLY;
    }

    Action sing() {
        System.out.println("I am singing");
        return Action.SING;
    }
}
