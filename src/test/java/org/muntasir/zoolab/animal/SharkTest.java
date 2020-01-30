package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {

    Shark shark;

    @BeforeEach
    void setUp() {
        shark = new Shark();
    }

    @Test
    void eat() {
        ClownFish fish = new ClownFish();
        assertEquals(Action.EAT, shark.eat(fish));
    }
}