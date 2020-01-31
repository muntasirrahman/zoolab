package org.muntasir.zoolab.main;

import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.animal.*;
import org.muntasir.zoolab.thing.Phone;

public class Solution {

    public static void main(String[] args) throws ActionException {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();

        Parrot parrot = new Parrot();
        Dog dog = new Dog();
        parrot.liveNearby(dog);

        Cat cat = new Cat();
        parrot.liveNearby(cat);

        Chicken rooster = new Chicken(true);
        parrot.liveNearby(rooster);
        parrot.sing();

        Duck duck = new Duck();
        parrot.liveNearby(duck);

        Phone phone = new Phone();
        parrot.liveNearby(phone);
    }


}
