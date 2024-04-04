package Questions;

import java.util.*;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), i = num - 1;
        sc.nextInt();
        while (i > 0) {
            if (i == num || num - i == 0) {
                break;
            }
            num *= i;
            i--;
        }
        System.out.println(num);
    }
}