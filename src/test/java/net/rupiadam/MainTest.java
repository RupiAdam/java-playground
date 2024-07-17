package net.rupiadam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void firstSum() {
        int[] firstInput = {1, 2, 3, 4};
        int[] firstOutput = {1, 3, 6, 10};
        assertArrayEquals(firstOutput, Main.sum(firstInput));
    }

    @Test
    void secondSum() {
        int[] secondInput = {1, 1, 1, 1, 1};
        int[] secondOutput = {1, 2, 3, 4, 5};
        assertArrayEquals(secondOutput, Main.sum(secondInput));
    }

    @Test
    void thirdSum() {
        int[] thirdInput = {3, 1, 2, 10, 1};
        int[] thirdOutput = {3, 4, 6, 16, 17};
        assertArrayEquals(thirdOutput, Main.sum(thirdInput));
    }
}