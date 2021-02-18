package models.drinks;

import models.ingredients.Coffee;
import models.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

public abstract class CoffeeDrink {
    private Coffee coffee;
    private List<Ingredient> ingredients = new ArrayList<>();

    public CoffeeDrink(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public int computeCalories() {
        return this.coffee.getCalories() + this.ingredients.stream().reduce(0,
                (subtotal, ingredient) -> subtotal + ingredient.getCalories(), Integer::sum);
    }

    @Override
    public String toString() {
        String ingredients = "";
        for (Ingredient ingredient : this.ingredients) {
            ingredients += ingredient.getName() + ", ";
        }

        return "coffee, " + ingredients + this.computeCalories();
    }
}
