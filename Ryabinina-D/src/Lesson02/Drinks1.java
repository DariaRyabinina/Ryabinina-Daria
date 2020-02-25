package Lesson02;

public enum Drinks1 {
    Эспрессо(1, 100),
    Капуччино(2, 200),
    Гляссе(3, 175.5),
    Шоколад(4, 150),
    Чай(5, 100);
    int number;
    double price;

    Drinks1(int number, double price) {
        this.number = number;
        this.price = price;
    }

    Drinks1(int number) {
        this.number = number;
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumber() {
        return this.number;
    }

    static public double getPriceNumber(int number) {
        for (Drinks1 drinks1 : Drinks1.values()) {
            if (drinks1.number == number) {
                return drinks1.price;
            }
        }
        return 0;
    }
}

