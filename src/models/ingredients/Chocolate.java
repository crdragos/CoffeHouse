package models.ingredients;

import models.enums.ChocolateType;

public class Chocolate extends Ingredient {
    private ChocolateType chocolateType;

    public Chocolate(String name, int calories, ChocolateType chocolateType) {
        super(name, calories);
        this.chocolateType = chocolateType;
    }
}
