package src.AAD.FinalQuestions;

import java.util.Scanner;

class Area {
    int breadth, length;

    public void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Q2 {

    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();

        Area a = new Area();
        a.setDim(l, b);
        System.out.println("Area: " + a.getArea());

        sc.close();
    }

}
