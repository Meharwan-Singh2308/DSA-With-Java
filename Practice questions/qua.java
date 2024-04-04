import java.util.*;
public class qua{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d;
        double x1;
        
        double x2;
        float rp;
        float ip;

        d =(b*b) - (4 *a *c);
        if (d >= 0)
        {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);

            System.out.println("the roots are " + x1 + " and " + x2);

        }
        else
        {
            System.out.println("the roots are not exist because the discriminant is negative ");
        }

    }
}