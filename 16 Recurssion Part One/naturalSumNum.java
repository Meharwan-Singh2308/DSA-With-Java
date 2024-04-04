public class naturalSumNum {

    public static int printSumOfNumbers(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n + printSumOfNumbers((n-1));

    }

    public static void main(String args[])
    {                                    
        System.out.println(printSumOfNumbers(5));
    }
}
