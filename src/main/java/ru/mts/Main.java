package ru.mts;

public class Main {
    public static void main(String[] args) {
        calculateTotalCost(new Purchase(3, 10, 0.75));
        calculateTotalCost(new Purchase(5, 5.5, 42.575));
        calculateTotalCost(new Purchase(10, 99.9, 59.1));
    }

    public static void calculateTotalCost(Purchase purchase){
        String totalCostWithoutDiscount = String.format("%.2f", purchase.getCount() * purchase.getPrice());
        String totalCostWithDiscount = String.format("%.2f", purchase.getCount()* purchase.getPrice() * (100 - purchase.getDiscount()) / 100);
        System.out.println(purchase);
        System.out.println("Общая стоимость без учёта скидки: " + totalCostWithoutDiscount);
        System.out.println("Общая стоимость c учетом скидки: " + totalCostWithDiscount);
        System.out.println();
    }
}