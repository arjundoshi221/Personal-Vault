package src.AAD.FinalQuestions;

class Triangle {
    int a, b, c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;

    }

    public void area() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
    }

    public void perimeter() {
        int peri = a + b + c;
        System.out.println("Perimeter: " + peri);
    }
}

public class q10 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        t.perimeter();
    }
}
