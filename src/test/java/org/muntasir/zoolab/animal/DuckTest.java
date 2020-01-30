package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.animal.Duck;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    Duck duck;

    @BeforeEach
    void setUp() {
        duck = new Duck();
    }

    @Test
    void sing() {
        assertEquals(Duck.QUACK, duck.sing());
    }

    @Test
    void swim() {
        Assertions.assertEquals(Action.SWIM, duck.swim());
    }
}