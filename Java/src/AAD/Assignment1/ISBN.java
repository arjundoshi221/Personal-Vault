

public class ISBN {
    public static void main(String[] args) {
        int num = 1259060977;
        int count = 0, temp = num, sum = 0, remainder;

        while (temp > 0) {
            remainder = temp % 10;
            temp /= 10;
            sum += remainder * count++;
        }

        if (sum % 11 == 0) {
            System.out.println(num + "is an ISBN number");

        } else {
            System.out.println(num + "is not ISBN number");
        }
    }
}