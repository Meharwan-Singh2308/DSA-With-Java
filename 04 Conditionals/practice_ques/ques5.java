package practice_ques;

import java.util.*;

public class ques5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // if year is divisible by 4 or 400 it is a leap year
        // if year is divisible by 100 it is not a leap year
        // if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
        //     System.out.print("leap year");
        // } else {

        //     System.out.println("not a leap year");
        // }
        if ((year % 4) == 0 && year % 400 == 0 || year%100 != 0) {
            System.out.println("leap year ");
        } else if (year % 100 != 0) {
            System.out.println("not a leap year");
        }
    }
}
