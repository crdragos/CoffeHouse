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

        Coffee coffee = null;
        try {
            coffee = new Coffee(2, "Columbia", "medium", 20);

            Scanner reader = new Scanner(input);

            String[] drinks = null;
            while (reader.hasNextLine()) {
                drinks = reader.nextLine().split(", ");

            }

            for (String drink : drinks) {
                if (drink.equals(PossibleDrinks.cafeBombon)) {
                    CoffeeDrink coffeeDrink = new CafeBombon(coffee);
                    System.out.println(coffeeDrink.toString());
                } else if (drink.equals(PossibleDrinks.cafeLatte)) {
                    CoffeeDrink coffeeDrink = new CaffeLatte(coffee);
                    System.out.println(coffeeDrink.toString());
                } else if (drink.equals(PossibleDrinks.cappuccino)) {
                    CoffeeDrink coffeeDrink = new Cappuccino(coffee);
                    System.out.println(coffeeDrink.toString());
                } else if (drink.equals(PossibleDrinks.espressino)) {
                    CoffeeDrink coffeeDrink = new Espressino(coffee);
                    System.out.println(coffeeDrink.toString());
                } else if (drink.equals(PossibleDrinks.espresso)) {
                    CoffeeDrink coffeeDrink = new Espresso(coffee);
                    System.out.println(coffeeDrink.toString());
                } else if (drink.equals(PossibleDrinks.latte)) {
                    CoffeeDrink coffeeDrink = new Latte(coffee);
                    System.out.println(coffeeDrink.toString());
                }
            }
        } catch (InvalidAttributeValueException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
