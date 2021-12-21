package tusk_1;

import java.util.Scanner;

public class CreditCard {

    Scanner sc = new Scanner(System.in);

    String accountId;
    double currentAccAmount;

    public CreditCard(String accountId, double currentAccAmount) {
        this.accountId = accountId;
        this.currentAccAmount = currentAccAmount;
    }

    public void addMoney() {
        System.out.println("Enter the amount you want to put on the card: ");
        double amount = sc.nextDouble();
        currentAccAmount += amount;
    }

    public void cashWithdrawal() {
        System.out.println("Enter the amount you want to withdraw from the card: ");
        double amount = sc.nextDouble();
        if (currentAccAmount >= amount)
            currentAccAmount -= amount;
        else
            System.out.println("Wrong amount. Not enough money in the account!");
    }

    public void currentStateCard() {
        System.out.println("Current account amount: " + currentAccAmount);
    }

}
