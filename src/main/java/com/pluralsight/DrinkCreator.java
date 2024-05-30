package com.pluralsight;
import java.util.Scanner;
public class DrinkCreator {

    public static void createDrink (Order order) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nChoose your drink:");
        System.out.println("1. Coke");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.print("Enter your choice: ");
        int drinkChoice = scanner.nextInt();
        String[] drinkTypes = {"Coke", "Pepsi", "Sprite"};
        String drinkType = drinkTypes[drinkChoice - 1];

        // Choose drink size
        System.out.println("Choose the drink size: (1. Small, 2. Medium, 3. Large)");
        int drinkSizeChoice = scanner.nextInt();
        DrinkSize drinkSize = DrinkSize.values()[drinkSizeChoice - 1];

        // Create the drink
        Drink drink = new Drink();
        drink.setType(drinkType);
        drink.setSize(drinkSize);

        drink.toString();
        order.getCompletedDrink().add(drink);


        }

    }
