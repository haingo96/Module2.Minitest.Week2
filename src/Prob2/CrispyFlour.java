package Prob2;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        if (LocalDate.now().isAfter(getExpiryDate().minusMonths(2))
        || LocalDate.now().isEqual(getExpiryDate().minusMonths(2))) {
            return cost * 0.6;
        } else if (LocalDate.now().isAfter(getExpiryDate().minusMonths(4))
                || LocalDate.now().isEqual(getExpiryDate().minusMonths(4))
                && LocalDate.now().isBefore(getExpiryDate().minusMonths(2))) {
            return cost * 0.8;
        } else {
            return cost * 0.95;
        }
    }
}
