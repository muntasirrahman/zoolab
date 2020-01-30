package org.muntasir.zoolab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.animal.Animal;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal();
    }

    @Test
    void walk() {
        assertEquals(Action.WALK, animal.walk());
    }
}