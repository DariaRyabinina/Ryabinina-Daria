package Lesson04;

public enum action {
    Summ {
        double summ(double a, double b) {
            return (a + b);
        }
    },
    Sub {
        double sub(double a, double b) {
            return (a - b);
        }
    },
    Mult {
        double mult(double a, double b) {
            return (a * b);
        }
    },
    Div {
        double div(double a, double b) {
            return (a / b);
        }
    },
    Perc {
        double perc(double a, double b) {
            return (a * b / 100);

        }
    };;


}
