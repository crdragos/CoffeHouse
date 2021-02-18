package models.drinks;

import models.ingredients.Coffee;
import models.ingredients.Milk;
import models.enums.MilkType;

public class Cappuccino extends Espresso {

    public Cappuccino(Coffee coffee) {
        super(coffee);
        super.addIngredient(new Milk("milk", 100, MilkType.hot));
        super.addIngredient(new Milk("milk", 80, MilkType.steamed));
    }

    @Override
    public String toString() {
        return "Cappuccino, " + super.toString();
    }
}
