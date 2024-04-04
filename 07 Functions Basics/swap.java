public class swap {

    public static void swaper(int a,int b)
    {
        int temp = a;// temp = 100
        a = b;// a = 100
        b = temp;// b = 100

        System.out.println("a is " +  a );
        System.out.println("b is " +  b );
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 70;
        swaper(a, b);
    }
}