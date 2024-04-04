public class fnover {


    // function overloading by the numbers of parameters
    public static int sum(int a , int b , int c)
    {
        return a + b+c;
    }

    public static int sum ( int a,int b )
    {
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,6));
    }
}