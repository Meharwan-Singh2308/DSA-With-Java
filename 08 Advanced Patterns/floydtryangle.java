public class floydtryangle {

    public static void patterngenrator(int n)
    {
        int num = 1;
        for(int i = 1;i<= n;i++)
        {
            for(int j =1;j<= i;j++)
            {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {                                    
        patterngenrator(5);         
    }
}
