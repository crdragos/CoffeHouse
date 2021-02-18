package controllers;

import models.drinks.*;
import models.enums.PossibleDrinks;
import models.ingredients.Coffee;

import javax.management.InvalidAttributeValueException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoffeeHouse {
    public static void main(String[] args) {
        File input = new File("drinks.txt");

        Coffee coffee;
        try {
            coffee = new Coffee(2, "Columbia", "medium", 20);

            Scanner reader = new Scanner(input);

            String[] drinks = null;
            while (reader.hasNextLine()) {
                drinks = reader.nextLine().split(", ");

            }

            assert drinks != null;
            for (String drink : drinks) {
                switch (drink) {
                    case PossibleDrinks.cafeBombon -> {
                        CoffeeDrink coffeeDrink = new CafeBombon(coffee);
                        System.out.println(coffeeDrink.toString());
                    }
                    case PossibleDrinks.cafeLatte -> {
                        CoffeeDrink coffeeDrink = new CaffeLatte(coffee);
                        System.out.println(coffeeDrink.toString());
                    }
                    case PossibleDrinks.cappuccino -> {
                        CoffeeDrink coffeeDrink = new Cappuccino(coffee);
                        System.out.println(coffeeDrink.toString());
                    }
                    case PossibleDrinks.espressino -> {
                        CoffeeDrink coffeeDrink = new Espressino(coffee);
                        System.out.println(coffeeDrink.toString());
                    }
                    case PossibleDrinks.espresso -> {
                        CoffeeDrink coffeeDrink = new Espresso(coffee);
                        System.out.println(coffeeDrink.toString());
                    }
                    case PossibleDrinks.latte -> {
                        CoffeeDrink coffeeDrink = new Latte(coffee);
                        System.out.println(coffeeDrink.toString());
                    }
                }
            }
        } catch (InvalidAttributeValueException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
