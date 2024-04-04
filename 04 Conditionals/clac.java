import java.util.*;
public class clac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the value of the first number : ");
        int a = sc.nextInt();
        System.out.print("Input the value of the second number : ");
        int b = sc.nextInt();
        System.out.print("Input the the Operator : ");      
        char character = sc.next().charAt(0);
        switch(character)
        {
            case '+' : System.out.println("the result is : " + (a + b)); break;
            case '-' : System.out.println("the result is : " + (a - b));break;
            case '/' : System.out.println("the result is : " + (a / b));break;
            case '%' : System.out.println("the result is : " + (a % b));break;
            case '*' : System.out.println("the result is : " + (a * b));break;
            default : System.out.println("this is not an valid Operator");
        }


    }
}