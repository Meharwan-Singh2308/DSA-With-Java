public class product {

    public static int multiply(int a , int b)
    {
        int product = a*b;
        // System.out.println("The product is : " + product);
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int product = multiply(a, b);
        System.out.println("The product is : " + product);

    }
}