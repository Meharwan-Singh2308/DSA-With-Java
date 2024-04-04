import java.util.*;

public class largestNrmber {

    public static int getLargestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest value is : " + smallest);
        return largest;

    }

    public static void main(String args[]) {
        int[] numbers = { 106, 2, 45, 7, 5, 69 };
        System.out.println("The Largest Number is : " + getLargestNumber(numbers));
    }
}
