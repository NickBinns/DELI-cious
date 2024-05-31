package com.pluralsight;
import java.util.Scanner;
import java.util.ArrayList;

public class SandwichCreator {

    static Scanner userChoice = new Scanner(System.in);

    public static void createSandwich(Order order) {

        // Choose bread
        System.out.println("""
                --------------------
                Select your bread:
                1. White
                2. Wheat
                3. Rye
                4. Wrap
                --------------------
                """);
        System.out.print("Enter here: ");
        int breadChoice = userChoice.nextInt();
        Bread bread = Bread.values()[breadChoice - 1];

        // Choose size
        System.out.println("""
                -------------------------
                Select your bread size:
                1. Small
                2. Medium
                3. Large
                -------------------------
                """);
        System.out.print("Enter here:");
        int sizeChoice = userChoice.nextInt();
        Size size = Size.values()[sizeChoice - 1];

        // Choose premium toppings
        System.out.println("""
                -------------------------------------
                Enter one of the premium toppings:
                steak
                ham
                salami
                roast beef
                chicken
                bacon
                --------------------------------------
                """);
        System.out.print("Enter your choice: ");
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
        System.out.println("""
                ------------------------
                Select your cheese:
                american
                provolone
                cheddar
                swiss
                colby jack
                ------------------------
                """);
        System.out.print("Enter your choice: ");
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
                System.out.print("Enter your choice: ");
                char toastedChoice = userChoice.next().charAt(0);
                boolean toasted = toastedChoice == 'Y' || toastedChoice == 'y';

                System.out.println("""
                                ---------------------------------------------------
                                Select all the regular toppings you would like (separate by comma):
                                lettuce
                                peppers
                                onions
                                tomatoes
                                jalapenos
                                cucumbers
                                pickles
                                guacamole
                                mushrooms
                                ----------------------------------------------------
                                """);
                System.out.print("Enter your choice: ");
                userChoice.nextLine();
                String regularToppingsInput = userChoice.nextLine();
                String[] regularToppingsArray = regularToppingsInput.split(",");
                ArrayList<String> regularToppings = new ArrayList<>();
                for (String topping : regularToppingsArray) {
                    regularToppings.add(topping.trim());
                }

                // Choose sauces
                System.out.println("""
                        --------------------------
                        Select your sauces (separate by comma):
                        mayo
                        mustard
                        ketchup
                        aioli
                        ranch
                        thousand island
                        vinaigrette
                        au jus
                        --------------------------
                        """);
                System.out.print("Enter your choice: ");
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


