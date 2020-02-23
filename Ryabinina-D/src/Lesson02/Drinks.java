package Lesson02;

public class Drinks {
    private String drink = new String();
    private double price;
    private int n;

    public Drinks(int n, String drink, double price) {
        this.drink = drink;
        this.price = price;
        this.n = n;

    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void showDrink(){
        System.out.println(n+"   "+drink+"   "+price);
    }

    public double getN() {
        return this.n;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDrink() {
        return this.drink;
    }
}
