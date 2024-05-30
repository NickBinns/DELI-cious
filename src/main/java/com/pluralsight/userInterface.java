package com.pluralsight;
import java.util.Scanner;
public class userInterface {
    static Scanner userInput = new Scanner(System.in);

    //Home Screen
    public static void HomeScreen() {

        do {

            System.out.println("""
                    ---------------------------------
                     Welcome to DELI-cious Sandwiches,
                     1) New Order
                     0) Exit
                    ----------------------------------
                    """);
            System.out.print("Enter a option: ");
            int userOption = userInput.nextInt();

            if (userOption == 1) {
                OrderScreen(userOption);
                break;

            } else if (userOption == 0) {
                System.exit(0);

            } else {
                System.out.println("Error!");
            }


        } while (true);
    }

    //Order Screen
    public static void OrderScreen(int userOption) {

        Order order = new Order();

        do {

            System.out.print("""
                    ---------------------------------
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    0) Cancel Order
                    ---------------------------------
                    """);
            System.out.print("Enter a option: ");
            int choice = userInput.nextInt();


            switch (choice) {
                case 1:
                    SandwichCreator.createSandwich(order);
                    userInput.nextLine();
                    break;
                case 2:
                    DrinkCreator.createDrink(order);
                    userInput.nextLine();
                    break;
                case 3:
                    ChipsCreator.createChips(order);
                    userInput.nextLine();
                    break;
                case 4:
                    Checkout.displayOrder(order);
                    userInput.nextLine();
                    break;

                case 0:
                    HomeScreen();
                    break;
            }

        } while (true);
    }
}


