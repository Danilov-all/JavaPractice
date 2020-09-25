package ru.mirea.practice8;

public class cabinet extends furniture {
    private int price;
    private String material;

    public cabinet(int price, String material) {
        this.price = price;
        this.material = material;
    }

    @Override
    public void buy() {
        System.out.println(price + ", " + material);
    }
}
