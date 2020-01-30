package org.muntasir.zoolab.main;

import org.muntasir.SoundEmitter;
import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.Flyer;
import org.muntasir.zoolab.Swimmer;
import org.muntasir.zoolab.Walker;
import org.muntasir.zoolab.animal.*;

public class AnimalCounter {

    public static void main(String[] args) {

        Butterfly butterfly = new Butterfly();
        butterfly.metamorph();

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                butterfly,
                new Cat()
        };


        int flyCounter = 0, walkCounter = 0, singCounter = 0, swimCounter = 0;
        StringBuilder flyers = new StringBuilder();
        StringBuilder walkers = new StringBuilder();
        StringBuilder singers = new StringBuilder();
        StringBuilder swimmers = new StringBuilder();

        for (Animal animal : animals) {

            if (animal instanceof Flyer) {
                Flyer flyer = (Flyer) animal;
                try {
                    flyer.fly();
                    flyCounter++;
                    flyers.append(", ").append(animal.getClass().getSimpleName());

                } catch (ActionException e) {
                    System.err.println("This animal can't fly");
                }
            }

            if (animal instanceof Walker) {
                walkCounter++;
                walkers.append(", ").append(animal.getClass().getSimpleName());
            }

            if (animal instanceof SoundEmitter) {
                singCounter++;
                singers.append(", ").append(animal.getClass().getSimpleName());
            }

            if (animal instanceof Swimmer) {
                swimCounter++;
                swimmers.append(", ").append(animal.getClass().getSimpleName());
            }
        }

        System.out.println("Flyer: " + flyCounter + flyers);
        System.out.println("Walkers: " + walkCounter + walkers);
        System.out.println("Singers: " + singCounter + singers);
        System.out.println("Swimmers: " + swimCounter + swimmers);

    }
}
