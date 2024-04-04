public class bintodec {

    public static int dectobin(int n)
    {
        int dec = 0;
        int pow = 0;
        int LD = 0;

        while(n > 0)
        {
            LD = n % 10;
            dec = dec + LD * (int) Math.pow(2,pow);
            n = (int) n /10;
            pow++;
        }
        return dec;
           
    }

    public static void main(String[] args) {

        System.out.println(dectobin(111));
    }
}