public class dectobin {

    public static void DecToBin(int Dec)
    {
        int dec = Dec;
        int bin = 0;
        int pow = 0;
        int rem = 0;
        while( dec > 0)
        {   
        rem = dec % 2;
        bin = bin + (rem )*(int) (Math.pow(10,pow ));

        dec = (int)dec/2;
        pow++;
        }

        System.out.println("the Binary form is "+bin);
        }

    public static void main(String[] args) {
    DecToBin(12);                
    }
}