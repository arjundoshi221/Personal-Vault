public class CopyElements {
    public static void main(String[] args) {
        int a[] = { 1, 5, 7, 9, 2, 7, 4, 8, 3 };
        int b[] = { 2, 6, 3, 8, 0 };
        int c[] = new int[a.length + b.length];
        int posC = 0;
        for (int i = 0; i < a.length; i++) {
            c[posC] = a[i];
            posC++;
        }
        for (int i = 0; i < b.length; i++) {
            c[posC] = b[i];
            posC++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
