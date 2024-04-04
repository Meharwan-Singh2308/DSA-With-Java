public class increasing {
    //print numbers in increasing order from 1 to n

    public static void printInc(int n )
    {
        if(1 == n)
        {
            System.out.print(1 + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    
    public static void main(String[] args) {
        printInc(5);
    }
}