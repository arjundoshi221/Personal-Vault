import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();

        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            w = ch + w;
        }
        System.out.println(w);
        sc.close();

    }

}
