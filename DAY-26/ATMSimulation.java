import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice;

        do {
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = sc.nextInt();

                    if(withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Collect your cash");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 3:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();

                    balance += deposit;
                    System.out.println("Amount deposited");
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);

        sc.close();
    }
}