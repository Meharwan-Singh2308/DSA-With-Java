public class oddEvern {

    public static void oddEven(int n)
    {
        if((n & 1) == 0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[])
    {                                    
        oddEven(4);
        oddEven(7);
        oddEven(11);
    }
}
