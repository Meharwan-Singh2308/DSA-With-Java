public class chat {
    public static void main(String[] args) {
        int n = 5; // Define the number of rows

        int[][] pattern = new int[n][n];

        int row = 0;
        int col = 0;
        int maxNumber = n * (n + 1) / 2;

        for (int num = 1; num <= maxNumber; num++) {
            pattern[row][col] = num;

            if (row == col) {
                row++;
                col = 0;
            } else {
                row--;
                col++;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
