package models.drinks;

import models.ingredients.Coffee;
import models.ingredients.Ingredient;
import models.ingredients.Milk;
import models.ingredients.Water;
import models.enums.MilkType;

import java.util.ArrayList;
import java.util.List;

public class CaffeLatte extends CoffeeDrink {

    public CaffeLatte(Coffee coffee) {
        super(coffee);
        super.addIngredient(new Water("water", 10));
        super.addIngredient(new Milk("milk", 100, MilkType.hot));
    }

    @Override
    public String toString() {

        return "Caffe Latte, " + super.toString();
    }
}
