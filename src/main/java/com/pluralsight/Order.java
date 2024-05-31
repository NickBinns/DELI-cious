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
        return this.completedSandwiches;
    }

    public void setCompletedSandwiches(List<Sandwich> completedSandwiches) {
        this.completedSandwiches = completedSandwiches;
    }

    public List<Drink> getCompletedDrink() {
        return this.completedDrink;
    }

    public void setCompletedDrink(List<Drink> completedDrink) {
        this.completedDrink = completedDrink;
    }

    public List<Chips> getCompletedChips() {
        return this.completedChips;
    }

    public void setCompletedChips(List<Chips> completedChips) {
        this.completedChips = completedChips;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        double total = 0;

        //Loop through completed sandwiches
        for (Sandwich sandwich : completedSandwiches) {
            output.append("Sandwich: ").append(sandwich.getBread()).append(", Size: ").append(sandwich.getSize()).append(", Premium Toppings :").append(sandwich.getPremiumToppings()).append(", Extra Toppings: ").append(sandwich.getExtraToppings()).append(", Cheese: ").append(sandwich.getCheese()).append(", Extra Cheese: ").append(sandwich.getExtraCheese()).append(", Toasted: ").append(sandwich.isToasted()).append(", Regular Toppings: ").append(sandwich.getRegularToppings()).append(", Sauces: ").append(sandwich.getSauces()).append(", Price: ").append(sandwich.calculatePrice()).append("\n");
            total += sandwich.calculatePrice();
        }

        // Loop through completed drinks
        for (Drink drink : completedDrink) {
            output.append("Drink: ").append(drink.getType()).append(", Size: ").append(drink.getSize()).append(", Price: ").append(drink.calculateDrinkPrice()).append("\n");
            total += drink.calculateDrinkPrice();
        }

        // Loop through completed chips
        for (Chips chips : completedChips) {
            output.append("Chips: ").append(chips.getSize()).append(", Type: ").append(chips.getType()).append(", Price: ").append(chips.calculateChipPrice()).append("\n");
            total += chips.calculateChipPrice();
        }

        // Add final price
        output.append("Total Price: ").append(total).append("\n");

        return output.toString();
    }
}

