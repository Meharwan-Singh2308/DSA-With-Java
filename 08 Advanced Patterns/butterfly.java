public class butterfly {

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            // spaces
            for (int spaces = 1; spaces <= 2 * (n - i); spaces++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            // spaces
            for (int spaces = 1; spaces <= (2 * (n - i)); spaces++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        butterfly(4);
    }
}
