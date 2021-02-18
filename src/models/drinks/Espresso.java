package models.drinks;

import models.ingredients.Coffee;
import models.ingredients.Water;

public class Espresso extends CoffeeDrink {

    public Espresso(Coffee coffee) {
        super(coffee);
        super.addIngredient(new Water("water", 10));
    }

   /* @Override
    public String toString() {
        return "Espresso, " + super.toString();
    }*/
}
