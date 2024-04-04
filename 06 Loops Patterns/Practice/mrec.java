public class mrec {
    public static void main(String[] args) {
        int n = 4;
        int spaces = n - 2;
        int rowss = 1;
        // outer loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            if (line == 1 || line == n) {
                for (rowss = 1; rowss <= n; rowss++) {
                    System.out.print("*");
                }
            } else {
                for (int stars = 1; stars <= line; stars++) {
                    if (stars == spaces) {
                        System.out.print("");
                    } else {
                        System.out.print("*");
                    }
                }

            }
            System.out.println();
        }
    }
}