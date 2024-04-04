public class sumsubarr3 {



    // By Kadan's Algoritham 
    public static void sumsubKadansAlgoritham(int[] numbers)
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0;i<numbers.length;i++)
        {
            cs = cs + numbers[i];

            if(cs < 0)
            {
                cs = 0;
            }

            ms = Math.max(cs, ms);

        }
        System.out.println("The Max valuse is : " + ms);
    }


    public static void main(String args[])
    {                                    
        int[] numbers = { -2 , -3 , 4 , -1 , -2,1 ,5, -3};                                 
        sumsubKadansAlgoritham(numbers);
    }
}
