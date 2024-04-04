public class rec {
    public static void main(String[] args) {

        int n = 4;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n+1; j++) {
                if ((j == 2 || j == 3 || j == 4) &&((i==2)||(i==3))) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
