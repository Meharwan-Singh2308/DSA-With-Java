package Questions;

import java.util.*;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = 0;
        int evensum = 0;
        int oddsum = 0;
        int i = 0;
        while(i <= 10)
        {
            numbers = sc.nextInt();
            if(numbers % 2 == 0)
            {
                evensum += numbers;
            }
            else{
                oddsum += numbers;
            }
            i++;
        }
        System.out.println("The sum of even numbers are : " + evensum);
        System.out.println("The sum of odd numbers are : " + oddsum);
        sc.close();
    }
}