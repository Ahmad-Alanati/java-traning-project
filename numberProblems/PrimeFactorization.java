package numberProblems;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scannerObject.nextInt();
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 1; i < number / i; i++) {
            if (number % i == 0) {
                primeFactors.add(i);
                primeFactors.add(number/i);
            }
        }
        System.out.print(primeFactors);
        

    }
}
