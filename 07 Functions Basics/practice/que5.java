package practice;

public class que5 {

    public static int sumDigit(int n)
    {
        int digit = n;
        int sum = 0;
        int remainder = 0;
        while(digit > 0)
        {
            remainder = digit % 10;
            sum += remainder;
            digit = digit / 10;
        }

        return sum;

    }

    public static void main(String args[])
    {                                    
        System.out.println(sumDigit(12345));                                         
    }
}
