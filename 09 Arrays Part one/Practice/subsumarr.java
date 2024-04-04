package Practice;

import java.util.*;

public class subsumarr {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static int[] subarray(int numbers[]) {
        int[] sumsub = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int[] arrsum = {};
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    // System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                sumsub[i] = sum;

                System.out.print(sum);

                System.out.println();
            }
            System.out.println();
        }
        return sumsub;
    }

    public static void main(String args[]) {
        int[] numbers = { 2, 4, 6, 8, 10, 17 };
        int[] arr = subarray(numbers);
        System.out.println("Largest : " + largest(arr));
        System.out.println("Smallest : " + smallest(arr));

    }
}
