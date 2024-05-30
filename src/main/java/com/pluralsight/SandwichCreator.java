package com.pluralsight;
import java.util.Scanner;
import java.util.ArrayList;

public class SandwichCreator {

    static Scanner userChoice = new Scanner(System.in);

    public static void createSandwich(Order order) {

        // Choose bread
        System.out.println("Choose your bread: (1. White, 2. Wheat, 3. Rye, 4. Wrap)");
        int breadChoice = userChoice.nextInt();
        Bread bread = Bread.values()[breadChoice - 1];

        // Choose size
        System.out.println("Choose the size: (1. Small , 2. Medium, 3. Large)");
        int sizeChoice = userChoice.nextInt();
        Size size = Size.values()[sizeChoice - 1];

        // Choose premium toppings
        System.out.println("Enter one of premium toppings (steak, ham, salami, roast beef, chicken, bacon):");
        userChoice.nextLine();
        String premiumToppingsInput = userChoice.nextLine();
        String[] premiumToppingsArray = premiumToppingsInput.split(",");
        ArrayList<String> premiumToppings = new ArrayList<>();
        for (String topping : premiumToppingsArray) {
            premiumToppings.add(topping.trim());
        }

        // Choose extra toppings
        System.out.println("Do you want extra premium toppings? (Y/N)");
        char extraToppingsChoice = userChoice.next().charAt(0);
        ArrayList<String> extraToppings = new ArrayList<>();
        if (extraToppingsChoice == 'Y' || extraToppingsChoice == 'y') {
            System.out.println("Enter your extra toppings (separate by comma):");
            userChoice.nextLine();
            String extraToppingsInput = userChoice.nextLine();
            String[] extraToppingsArray = extraToppingsInput.split(",");
            for (String topping : extraToppingsArray) {
                extraToppings.add(topping.trim());
            }
        }

        // Choose cheese
        System.out.println("Enter your choice of cheese (american, provolone, cheddar, swiss):");
        userChoice.nextLine();
        String cheeseInput = userChoice.nextLine();
        String[] cheeseOption = cheeseInput.split(",");
        ArrayList<String> cheeseList = new ArrayList<>();
        for (String cheese : cheeseOption) {
            cheeseList.add(cheese.trim());
        }
            // Choose extra cheese
            System.out.println("Do you want extra cheese? (Y/N)");
            char extraCheeseChoice = userChoice.next().charAt(0);
            ArrayList<String> extraCheese = new ArrayList<>();
            if (extraCheeseChoice == 'Y' || extraCheeseChoice == 'y') {
                System.out.println("Enter your extra cheese (separate by comma):");
                userChoice.nextLine();
                String extraCheeseInput = userChoice.nextLine();
                String[] extraCheeseArray = extraCheeseInput.split(",");
                for (String xCheese : extraCheeseArray) {
                    extraCheese.add(xCheese.trim());
                }

            }

                // Choose toasted
                System.out.println("Do you want it toasted? (Y/N)");
                char toastedChoice = userChoice.next().charAt(0);
                boolean toasted = toastedChoice == 'Y' || toastedChoice == 'y';

                System.out.println("Enter your regular toppings (lettuce, peppers, onions, ,tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms): ");
                userChoice.nextLine();
                String regularToppingsInput = userChoice.nextLine();
                String[] regularToppingsArray = regularToppingsInput.split(",");
                ArrayList<String> regularToppings = new ArrayList<>();
                for (String topping : regularToppingsArray) {
                    regularToppings.add(topping.trim());
                }

                // Choose sauces
                System.out.println("Enter your sauces (mayo, mustard, ketchup, aioli, ranch, thousand island, vinaigrette, au jus):");
                userChoice.nextLine();
                String saucesInput = userChoice.nextLine();
                String[] saucesArray = saucesInput.split(",");
                ArrayList<String> sauces = new ArrayList<>();
                for (String sauce : saucesArray) {
                    sauces.add(sauce.trim());
                }

                Sandwich sandwich = new Sandwich();
                sandwich.setBread(bread);
                sandwich.setSize(size);
                sandwich.setPremiumToppings(premiumToppings);
                sandwich.setExtraToppings(extraToppings);
                sandwich.setCheese(cheeseList);
                sandwich.setExtraCheese(extraCheese);
                sandwich.setToasted(toasted);
                sandwich.setRegularToppings(regularToppings);
                sandwich.setSauces(sauces);

                sandwich.toString();
                order.getCompletedSandwiches().add(sandwich);

            }
        }


