import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();

        s = s.trim();

        int c = 0, v = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                v++;
            }

            else {
                c++;
            }
        }
        System.out.println("Frequency of vowels= " + v);
        System.out.println("Frequency of consonants= " + c);

        sc.close();
    }

}
