import java.util.*;

public class sumnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), counter = 1,j = 0;
        sc.close();
        while(counter <= n)
        {
            j += counter;
            counter++;
        }
        System.out.println(j);
    }
}

