public class que1 {
    public static void main(String[] args) {
        Complex num = new Complex(12,14);
        num.sum();
        num.sub();
        num.product();
        
    }
}

class Complex{
    int real;
    int imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void sum()
    {
        int sum = real + imaginary;
        System.out.println("The Sum is : " + sum);
    }
    void sub(){
        int sub = real - imaginary;
        System.out.println("The Sub is : " +sub);
    }
    void product()
    {
        int product = real * imaginary;
        System.out.println("The Product is : " +product);
    }
}