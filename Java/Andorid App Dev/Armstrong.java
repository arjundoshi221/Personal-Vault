package college;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = Obj.nextInt();
        int temp = n;
        int x = 0, sum = 0;
        while(temp>0){ 
            ++x;
            temp = temp/10;
        }
        temp = n;
        while(temp>0){
            sum += (Math.pow(temp%10,x));
            temp = temp/10;
        }
        if (n == sum){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is NOT an Armstrong number");
        }
        Obj.close();
    }
}