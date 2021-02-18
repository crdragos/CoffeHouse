package models.drinks;

import models.ingredients.Coffee;
import models.ingredients.Milk;
import models.ingredients.Sugar;
import models.enums.MilkType;

public class CafeBombon extends Espresso {
    public CafeBombon(Coffee coffee) {
        super(coffee);
        super.addIngredient(new Sugar("sugar", 100));
        super.addIngredient(new Milk( "milk", 100, MilkType.condensed));
    }

    @Override
    public String toString() {
        return "Coffee bombon, " + super.toString();
    }
}
