package org.muntasir.zoolab;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    Bird bird;

    @BeforeAll
    void setUp() {
        bird = new Bird();
    }

    @Test
    void fly() {
        assertEquals(Action.FLY, bird.fly());
    }

    @Test
    void sing() {
        assertEquals(Action.SING, bird.sing());
    }
}