package ru.mirea.practice8;

public class bed extends furniture{
    private int price;
    private String material;

    public bed(int price, String material) {
        this.price = price;
        this.material = material;
    }

    @Override
    public void buy() {
        System.out.println(price + ", " + material);
    }
}
