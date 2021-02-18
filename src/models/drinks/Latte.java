package models.drinks;

import models.ingredients.Coffee;
import models.ingredients.Milk;
import models.enums.MilkType;

public class Latte extends Espresso {

    public Latte(Coffee coffee) {
        super(coffee);
        super.addIngredient(new Milk("milk", 80, MilkType.steamed));
    }

    @Override
    public String toString() {
        return "Latte, " + super.toString();
    }
}
