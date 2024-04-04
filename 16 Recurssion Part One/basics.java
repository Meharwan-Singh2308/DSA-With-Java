public class basics {
    //Print Numbers in decreasing order 

    public static void printNums(int n )
    {
        System.out.println(n);
        if(n == 1)
        {
            return;
        }
        printNums(n-1);
    }

    public static void main(String[] args) {
        printNums(5);
    }
}