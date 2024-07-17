package net.rupiadam;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var result = sum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }

    static int[] sum(int[] nums) {
        int[] result = new int[nums.length];
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            result[i] = currentSum;
        }

        return result;
    }
}