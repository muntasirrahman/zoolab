package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.animal.Bird;
import org.muntasir.zoolab.animal.Chicken;
import org.muntasir.zoolab.animal.Duck;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    Bird bird;

    @BeforeEach
    void setUp() {
        bird = new Bird();
    }

    @Test
    void fly() throws ActionException {
        Assertions.assertEquals(Action.FLY, bird.fly());
    }

    @Test
    void sing() {
        assertEquals(Bird.SING, bird.sing());
    }

    @Test
    void walking() {
        assertEquals(Action.WALK, bird.walk());
    }
}