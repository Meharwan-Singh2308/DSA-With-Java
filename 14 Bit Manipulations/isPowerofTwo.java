public class isPowerofTwo {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static void main(String args[])
    {                                    

        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(17));
        System.out.println(isPowerOfTwo(18));
        System.out.println(isPowerOfTwo(19));
        System.out.println(isPowerOfTwo(20));
    }
}
