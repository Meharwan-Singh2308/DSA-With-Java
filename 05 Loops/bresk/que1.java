package bresk;

import java.util.*;

public class que1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if ((n % 10) == 0) {
                System.out.println("you typed the multiple of ten !!");
                break;
            }
            System.out.println(n);
        }
        sc.close();
    }
}
