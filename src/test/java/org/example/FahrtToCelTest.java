package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FahrtToCelTest {

    @Test
    void convertFahr() {
        int test = (FahrtToCel.convertFahr(32));

        assertEquals(0, test);

        }

    }
