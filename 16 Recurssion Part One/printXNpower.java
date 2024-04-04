public class printXNpower {

    public static int printXN(int x , int n )
    {
        if(n == 1)
        {
            return x;
        }

        return x * printXN( x , n - 1);

    }

    public static void main(String args[])
    {                                    
        System.out.println(printXN(2, 10));
    }
}
