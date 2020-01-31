package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoosterTest {

    Rooster rooster;

    @BeforeEach
    void setUp() {
        rooster = new Rooster();
    }

    @Test
    void testId() {
        rooster.setId("ro102");
        assertEquals("ro102", rooster.getId());
        assertEquals("Rooster", rooster.getSpecies());
    }
}