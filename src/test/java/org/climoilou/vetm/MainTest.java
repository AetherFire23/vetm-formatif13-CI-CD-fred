package org.climoilou.vetm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

     @Test
     void mainTest() {
          assertTrue(true);
     }

     @Test
     public void failTest() {
          Assertions.assertFalse(true);
     }
}