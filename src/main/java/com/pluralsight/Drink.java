package com.pluralsight;

enum DrinkSize {
    SMALL, MEDIUM, LARGE
}
public class Drink {

    private String type;
    private DrinkSize size;

    // Method to calculate the total price of the drink
    public double calculateDrinkPrice() {
        double baseDrinkPrice = 2.00; // Base price of a drink

        // Calculate price based on size
        switch (size) {
            case SMALL:
                return baseDrinkPrice;
            case MEDIUM:
                return baseDrinkPrice + 0.5;
            case LARGE:
                return baseDrinkPrice + 1.0;
            default:
                return baseDrinkPrice;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
       StringBuilder output = new StringBuilder();
        output.append("\nDrink Order Summary:");
        output.append("\nType: " + getType());
        output.append("\nSize: " + getSize());
        output.append("\nTotal Price: $" + calculateDrinkPrice());
        return output.toString();
    }
}

