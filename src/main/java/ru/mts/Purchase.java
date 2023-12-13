package ru.mts;


/**
 * Данный класс покупки содержит в себе следующую информацию:
 * Количество товаров
 * Цена за единицу товара
 * Скидка
 */
public class Purchase {
    // Количество товаров
    private int count;
    // Цена за единицу товара
    private double price;
    // Скидка на покупку
    private double discount;

    public Purchase(int count, double price, double discount) {
        this.count = count;
        this.price = price;
        this.discount = discount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "count=" + count +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
