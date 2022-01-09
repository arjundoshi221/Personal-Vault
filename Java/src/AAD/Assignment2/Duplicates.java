import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        System.out.print("Enter size of array:\n");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int dup = 0;

        int arr1[] = new int[array_size];
        int temp[] = new int[array_size];
        int c = 0; // temp array counter
        int reps = 0;

        System.out.print("\nEnter array:\n");
        for (int i = 0; i < array_size; i++) // input loop
        {
            arr1[i] = sc.nextInt();

        }

        for (int i = 0; i < array_size; i++) // 1st array checker
        {
            int j;
            for (j = 0; j < c; j++) {
                if (temp[j] == arr1[i]) // checks similar
                {
                    dup++;
                    break;
                }
            }

            if (j == c) // when j reaches the maximum length i.e the end of the new array length. This
                        // adds
            // the value ai jth index in the right place
            {
                temp[c] = arr1[i]; // copies
                c++;
            }
        }

        for (int i = 0; i < c; i++) // reps counter loop
        {
            for (int j = 0; j < array_size; j++) {
                if (temp[i] == arr1[j]) {
                    reps += 1;
                }
            }

            if (reps > 1) // reps checker
            {
                System.out.println(temp[i] + " repeats itself " + reps + " times");
            }
            reps = 0;
        }

        System.out.println();
        for (int i = 0; i < c; i++)
            System.out.println(temp[i]);
        System.out.println("Number of repeated numbers: " + dup);
        sc.close();
    }
}
