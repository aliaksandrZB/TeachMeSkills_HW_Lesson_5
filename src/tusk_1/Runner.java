package tusk_1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CreditCard creditCard1 = new CreditCard("account1", 100);
        CreditCard creditCard2 = new CreditCard("account2", 200);
        CreditCard creditCard3 = new CreditCard("account3", 300);

        int choiceAction;
        CreditCard card = new CreditCard("0", 0);

        while (true) {
            System.out.println("---------------------------------\n1 - Choose a card.\n" +
                               "2 - Current state of the card.\n3 - Put money on the card.\n" +
                               "4 - Withdraw money from the card.\n0 - To finish work." +
                               "\n---------------------------------");

            switch (choiceAction = sc.nextInt()) {
                case 1:
                    System.out.println("Enter account number: ");
                    sc.nextLine();
                    String choiceAccNum = sc.nextLine();
                    switch (choiceAccNum) {
                        case "account1":
                            card = creditCard1;
                            break;
                        case "account2":
                            card = creditCard2;
                            break;
                        case "account3":
                            card = creditCard3;
                            break;
                        case "":
                            System.out.println("lol");
                            break;
                        default:
                            System.out.println("Invalid card number.");
                    }
                    break;
                case 2:
                    card.currentStateCard();
                    break;
                case 3:
                    card.addMoney();
                    break;
                case 4:
                    card.cashWithdrawal();
                    break;
                case 0:
                    System.out.println("Work completed");
                    return;
                default:
                    System.out.println("Invalid number!");
            }
        }

    }

}