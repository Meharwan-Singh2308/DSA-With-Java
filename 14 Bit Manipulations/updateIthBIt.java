public class updateIthBIt {


    public static int clearIthBit(int n , int i)
    {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBIt(int n , int i , int newbit)
    {
        // int bitMask = ~(1<<i);
        // return (n & bitMask) | (val << i);

        n = clearIthBit(n, i);
        int BItMask = newbit<<i;
        return n | BItMask;
        
    }

    public static void main(String args[])
    {                                    

        System.out.println(updateIthBIt(10,2,1));
    }
}
