package src.AAD.FinalQuestions;

public class Q1 {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };

        int sum = 0, product = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Sum of the array: " + sum);
        System.out.println("Product of the array: " + product);

    }

}
