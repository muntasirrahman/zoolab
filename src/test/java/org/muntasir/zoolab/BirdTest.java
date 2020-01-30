package org.muntasir.zoolab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    Bird[] bird;

    @BeforeEach
    void setUp() {
        bird = new Bird[] {
          new Bird(), new Duck(), new Chicken()
        } ;
    }

    @Test
    void fly() throws ActionException {
        assertEquals(Action.FLY, bird[0].fly());
        assertEquals(Action.FLY, bird[1].fly());
        assertThrows(ActionException.class, () -> bird[2].fly());
    }

    @Test
    void sing() {
        for (Bird b : bird) {
            assertTrue(b.sing().startsWith("Sound"));
        }

    }
}