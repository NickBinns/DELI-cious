package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Sandwich> completedSandwiches;
    List<Drink> completedDrink;
    List <Chips> completedChips;

    public Order() {
        this.completedSandwiches = new ArrayList<>();
        this.completedDrink = new ArrayList<>();
        this.completedChips = new ArrayList<>();
    }

    public List<Sandwich> getCompletedSandwiches() {
        return completedSandwiches;
    }

    public void setCompletedSandwiches(List<Sandwich> completedSandwiches) {
        this.completedSandwiches = completedSandwiches;
    }

    public List<Drink> getCompletedDrink() {
        return completedDrink;
    }

    public void setCompletedDrink(List<Drink> completedDrink) {
        this.completedDrink = completedDrink;
    }

    public List<Chips> getCompletedChips() {
        return completedChips;
    }

    public void setCompletedChips(List<Chips> completedChips) {
        this.completedChips = completedChips;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        double total = 0;

        for (Sandwich sandwich : completedSandwiches) {
            output.append("Sandwich: ").append(sandwich.getBread()).append(sandwich.getSize()).append(sandwich.getPremiumToppings()).append(sandwich.getExtraToppings()).append(sandwich.getCheese()).append(sandwich.getExtraCheese()).append(sandwich.isToasted()).append(sandwich.getRegularToppings()).append(sandwich.getSauces()).append(", Price: ").append(sandwich.calculatePrice()).append("\n");
            total += sandwich.calculatePrice();
        }

        // Loop through completed drinks
        for (Drink drink : completedDrink) {
            output.append("Drink: ").append(drink.getType()).append(drink.getSize()).append(", Price: ").append(drink.calculateDrinkPrice()).append("\n");
            total += drink.calculateDrinkPrice();
        }

        // Loop through completed chips
        for (Chips chips : completedChips) {
            output.append("Chips: ").append(chips.getSize()).append(", Price: ").append(chips.calculateChipPrice()).append("\n");
            total += chips.calculateChipPrice();
        }

        // Add final price
        output.append("Total Price: ").append(total).append("\n");

        return output.toString();
    }
}

//Create toString override in Order class (loop threw all items)
//Print summary for each item
//For each item, add final price
//Display final price