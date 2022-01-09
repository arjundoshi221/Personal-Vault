package Functions.Overloading;

public class OverI {
    public static void main(String[] args) {
        for (int H = -4; H <= 10; H++) {
            if (H > 3) {
                gravity(H);
            }
            if (H <= 3) {
                gravity((double) H);
            }
        }
    }

    public static double gravity(int H) {
        double G = 32.17 * Math.pow((4390 / (4390)), 2);
        return G;
    }

    public static double gravity(double H) {
        double G = 32.17 * Math.pow((1 / (H + 4390)), 2);
        return G;
    }
}
