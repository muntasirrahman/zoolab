package org.muntasir.zoolab;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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