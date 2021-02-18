package models.drinks;

import models.ingredients.Cocoa;
import models.ingredients.Coffee;
import models.ingredients.Milk;
import models.enums.MilkType;

public class Espressino extends Espresso {

    public Espressino(Coffee coffee) {
        super(coffee);
        super.addIngredient(new Milk("milk", 100, MilkType.steamed));
        super.addIngredient(new Cocoa("cocoa-powder", 50));
    }

    @Override
    public String toString() {
        return "Espressino, " + super.toString();
    }
}
