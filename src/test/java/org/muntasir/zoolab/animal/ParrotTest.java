package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.thing.Phone;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {

    Parrot parrot;

    @BeforeEach
    void setUp() {
        parrot = new Parrot();
    }

    @Test
    void sing() {
        Dog dog = new Dog();
        parrot.liveNearby(dog);
        assertEquals(Dog.WOOF, parrot.sing());

        Cat cat = new Cat();
        parrot.liveNearby(cat);
        assertEquals(Cat.MEOW, parrot.sing());

        Chicken rooster = new Chicken(true);
        parrot.liveNearby(rooster);
        assertEquals(Chicken.DOODLE, parrot.sing());

        Duck duck = new Duck();
        parrot.liveNearby(duck);
        assertEquals(Duck.QUACK, parrot.sing());

        Phone phone = new Phone();
        parrot.liveNearby(phone);
        assertEquals(Phone.RING, parrot.sing());

    }
}