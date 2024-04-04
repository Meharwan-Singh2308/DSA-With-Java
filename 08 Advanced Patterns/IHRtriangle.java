public class IHRtriangle {

    public static void invertedPyramid(int n )
    {
        int spaces = 0;
        for(int i =1;i<=n;i++)
        {
            for(spaces = 1;spaces <= n -i;spaces++)
            {
                System.out.print(" ");
            }
            spaces--;
            for(int stars = 1;stars <= i;stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {                                    
        invertedPyramid(25);                                 
    }   
}
