package Prob2;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(String name, LocalDate manufacturingDate, int cost, double weight) {
        super(name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        if (LocalDate.now().isAfter(getExpiryDate().minusDays(5))
        || LocalDate.now().isEqual(getExpiryDate().minusDays(5))) {
            return cost * 0.7;
        } else {
            return cost * 0.9;
        }
    }
}
