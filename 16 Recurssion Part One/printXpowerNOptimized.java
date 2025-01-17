public class printXpowerNOptimized {

    public static int power(int x, int n) {
        if (n == 0)
            return 1;

        if (n % 2 == 0) {
            int halfPower = power(x, n / 2);
            return halfPower * halfPower;
        } else {
            return x * power(x, (n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
}