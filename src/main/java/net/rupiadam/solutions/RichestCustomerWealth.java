package net.rupiadam.solutions;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int currentRichestCustomerWealth = 0;

        for (int[] account : accounts) {
            var totalBalance = 0;

            for (int i : account) {
                totalBalance += i;
            }

            if (totalBalance > currentRichestCustomerWealth) {
                currentRichestCustomerWealth = totalBalance;
            }
        }

        return currentRichestCustomerWealth;
    }
}
