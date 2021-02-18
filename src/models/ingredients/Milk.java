package models.ingredients;

import models.enums.MilkType;

public class Milk extends Ingredient {
    private MilkType type;

    public Milk(String name, int calories, MilkType type) {
        super(name, calories);
        this.type = type;
    }

    public MilkType getType() {
        return type;
    }

    public void setType(MilkType type) {
        this.type = type;
    }
}
