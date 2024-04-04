import java.util.*;
public class que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;true;i++)
        {
            int j = sc.nextInt();
            if(j%10 == 0){
                continue;
            }
            System.out.println(j);
        }
    }
}