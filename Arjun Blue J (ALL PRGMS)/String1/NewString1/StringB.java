package String1.NewString1;

public class StringB {
    public static void main(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isWhiteSpace(ch)) {
                c++;
            }
        }
        System.out.println("Number of spaces = " + c);
    }
}
