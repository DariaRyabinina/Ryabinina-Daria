package Lesson02;

public enum Drinks1 {
    Эспрессо(1, 100),
    Капуччино(2, 200),
    Гляссе(3, 175.5),
    Шоколад(4, 150),
    Чай(5, 100);
    int l;
     double ll;

    Drinks1(int l, double ll) {
        this.l = l;
        this.ll = ll;
    }

    Drinks1(int l) {
        this.l = l;
    }

    public double getPrice() {
        return (this.ll);
    }

    public double getNumber() {
        return (this.l);
    }

   static public double getPriceNumber(int l){
        for (Drinks1 drinks1 : Drinks1.values()) {
            if (drinks1.l == l) {
                return drinks1.ll;
            }
        }
        return 0;
    }
}

