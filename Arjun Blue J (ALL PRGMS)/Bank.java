//import java.util.*;

/**
 * PRELIM PAPER 2017 SMS(10) Q5
 */
public class Bank {
    int acc;
    String name;
    double bal;

    public Bank(String n, int ac, double balance) {
        name = n;
        acc = ac;
        bal = balance;
    }

    private void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc);
        System.out.println("Balance: " + bal);
    }

    private void interest() {
        double inte = 0.0;
        if (acc <= 10000) {
            inte = 0.0;
        }
        if (acc > 10000 && acc <= 250000) {
            inte = (3.5 / 100) * acc;
        }
        if (acc > 250000 && acc <= 1000000) {
            inte = (4.5 / 100) * acc;
        }
        if (acc > 1000000) {
            inte = (6.0 / 100) * acc;
        }
        System.out.println("\nInterest: " + inte);
        System.out.println("New Balance: " + (inte + bal));
    }

    public void main() {
        Bank obj = new Bank(name, acc, bal);
        obj.display();
        obj.interest();
    }
}
