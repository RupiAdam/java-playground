package net.rupiadam.solutions;

public class ReduceNumberToZero {

    // goals is to count the step to make a number become 0
    // odd =>  substract 1
    // even => devided 2

    public int numberOfSteps(int num) {
        int steps = 0;
        int numberLeft = num;

        while (numberLeft != 0) {
            if (numberLeft % 2 == 0) {
                numberLeft = numberLeft / 2;
            } else {
                numberLeft -= 1;
            }

            steps++;
        }

        return steps;
    }
}
