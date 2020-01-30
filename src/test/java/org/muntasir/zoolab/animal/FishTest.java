package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    Fish fish;

    @BeforeEach
    void setUp() {
        fish = new Fish();
    }

    @Test
    void swim() {
        assertEquals(Action.SWIM, fish.swim());
    }
}