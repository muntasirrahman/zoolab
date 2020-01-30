package org.muntasir.zoolab;

public class Bird extends Animal {

    public Action fly() throws ActionException {
        System.out.println("I am flying");
        return Action.FLY;
    }

    public String sing() {
        System.out.println("I am singing something");
        return "Sound";
    }
}
