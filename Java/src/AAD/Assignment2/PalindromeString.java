import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.nextLine();
        s = s + " ";
        String w = "";
        String pal = "";
        // int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                w = w + ch;
                pal = ch + pal;
            } else {
                if (pal.equalsIgnoreCase(w)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("NO");
                }
                w = "";
                pal = "";
            }

        }
        sc.close();

    }

}
