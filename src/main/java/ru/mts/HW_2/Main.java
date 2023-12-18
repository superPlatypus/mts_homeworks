package ru.mts.HW_2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        calculateTotalCost(new Purchase(3, 10, 0.75));
        calculateTotalCost(new Purchase(5, 5.5, 42.575));
        calculateTotalCost(new Purchase(10, 99.9, 59.1));
    }

    public static void calculateTotalCost(Purchase purchase){
        BigDecimal totalCostWithoutDiscount = BigDecimal.valueOf(purchase.getPrice()).multiply(BigDecimal.valueOf(purchase.getCount())).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalCostWithDiscount = totalCostWithoutDiscount.multiply(BigDecimal.valueOf((100 - purchase.getDiscount()) / 100)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(purchase);
        System.out.println("Общая стоимость без учёта скидки: " + totalCostWithoutDiscount);
        System.out.println("Общая стоимость c учетом скидки: " + totalCostWithDiscount);
        System.out.println();
    }
}