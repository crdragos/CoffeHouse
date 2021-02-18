package models.ingredients;

import javax.management.InvalidAttributeValueException;

public class Coffee {
    private double strength;
    private String origin;
    private String roastingDegree;
    private int calories;

    public Coffee(double strength, String origin, String roastingDegree, int calories) throws InvalidAttributeValueException {
        if (strength > 0 && strength <=3) {
            this.strength = strength;
        } else {
            throw new InvalidAttributeValueException("Coffee strength must be a number between 0 and 3");
        }
        this.origin = origin;
        this.roastingDegree = roastingDegree;
        this.calories = calories;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRoastingDegree() {
        return roastingDegree;
    }

    public void setRoastingDegree(String roastingDegree) {
        this.roastingDegree = roastingDegree;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
