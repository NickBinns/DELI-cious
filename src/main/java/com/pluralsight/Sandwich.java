package com.pluralsight;
import java.util.ArrayList;

enum Bread {
    WHITE, WHEAT, RYE, WRAP
}

enum Size {
    SMALL, MEDIUM, LARGE
}
    public class Sandwich {
        private Bread bread;
        private Size size;
        private ArrayList<String> premiumToppings = new ArrayList<>();
        private ArrayList<String> extraToppings = new ArrayList<>();
        private ArrayList<String> cheese;
        private ArrayList<String> extraCheese;
        private boolean toasted;
        private ArrayList<String> regularToppings = new ArrayList<>();
        private ArrayList<String> sauces = new ArrayList<>();

        public double calculatePrice() {
            double basePrice = 5.50; // Base price of a sandwich
            double baseToppingPrice = 1.00; // Price for each topping
            double cheesePrice = 0.75;

            // Calculate price based on size
            switch (size) {
                case SMALL:
                    basePrice -= 0; // Small sandwich
                    break;
                case MEDIUM:
                    basePrice += 1.5; // Medium sandwich
                    break;
                case LARGE:
                    basePrice += 3; // Large sandwich
                    break;
            }

            // Add extra toppings price
            double extraToppingsPrice = extraToppings.size() * 0.50;

            //Add extra cheese price
            double extraCheesePrice = cheese.size() * 0.30;

            // Calculate total price
            return basePrice + (premiumToppings.size() + extraToppings.size()) + cheese.size() * baseToppingPrice + extraToppingsPrice + cheesePrice + extraCheesePrice;
        }

        public Bread getBread() {
            return this.bread;
        }

        public void setBread(Bread bread) {
            this.bread = bread;
        }

        public Size getSize() {
            return this.size;
        }

        public void setSize(Size size) {
            this.size = size;
        }

        public ArrayList<String> getPremiumToppings() {
            return this.premiumToppings;
        }

        public void setPremiumToppings(ArrayList<String> premiumToppings) {
            this.premiumToppings = premiumToppings;
        }

        public ArrayList<String> getExtraToppings() {
            return this.extraToppings;
        }

        public void setExtraToppings(ArrayList<String> extraToppings) {
            this.extraToppings = extraToppings;
        }


        public boolean isToasted() {
            return this.toasted;
        }

        public void setToasted(boolean toasted) {
            this.toasted = toasted;
        }

        public ArrayList<String> getRegularToppings() {
            return this.regularToppings;
        }

        public void setRegularToppings(ArrayList<String> regularToppings) {
            this.regularToppings = regularToppings;
        }

        public ArrayList<String> getSauces() {
            return this.sauces;
        }

        public void setSauces(ArrayList<String> sauces) {
            this.sauces = sauces;
        }

        public ArrayList<String> getCheese() {
            return this.cheese;
        }

        public void setCheese(ArrayList<String> cheese) {
            this.cheese = cheese;
        }

        public ArrayList<String> getExtraCheese() {
            return this.extraCheese;
        }

        public void setExtraCheese(ArrayList<String> extraCheese) {
            this.extraCheese = extraCheese;
        }

        @Override
        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append("\nOrder Summary:");
            output.append("\nBread: " + getBread());
            output.append("\nSize: " + getSize());
            output.append("\nPremium Toppings: " + getPremiumToppings());
            output.append("\nExtra Toppings: " + getExtraToppings());
            output.append("\nCheese: " + getCheese());
            output.append("\nExtra Cheese: " + getExtraCheese());
            output.append("\nToasted: " + (isToasted() ? "Yes" : "No"));
            output.append("\nRegular Toppings: " + getRegularToppings());
            output.append("\nSauces: " + getSauces());
            output.append("\nTotal Price: $" + calculatePrice());
            return output.toString();
        }
}




