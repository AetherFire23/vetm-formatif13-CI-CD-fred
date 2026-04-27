package org.climoilou.vetm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testCesarCipher() {
        Assertions.assertEquals("cpokpvs", Main.cesarCipher("bonjour", 1));
        Assertions.assertEquals("a b c", Main.cesarCipher("z a b", 1));
    }

    @Test
    void testCesarDecipher() {
        Assertions.assertEquals("bonjour", Main.cesarDecipher("cpokpvs", 1));
        Assertions.assertEquals("z a b", Main.cesarDecipher("a b c", 1));
    }

    @Test
    void testMain() {
        Main.main(new String[] {});
    }
}