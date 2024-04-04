package practice_ques;
import java.util.*;

public class ques3 {
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int input = sc.nextInt();
        switch(input)
        {
            case 1 : System.out.println(" Monday "); break;
            case 2 : System.out.println(" tuesday "); break;
            case 3 : System.out.println(" Wednesday "); break;
            case 4 : System.out.println(" Thursday "); break;
            case 5 : System.out.println(" Friday "); break;
            case 6 : System.out.println(" Saturday "); break;
            case 7 : System.out.println(" Sunday "); break;
            default : System.out.println(" Input between 0 - 7 "); break;
        }
    }
}
