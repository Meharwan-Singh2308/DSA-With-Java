package ASSINGNMENT;

public class que3 {

    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int matrix[][]) {
        int row = matrix.length, col = matrix[0].length;

        int matrix2[][] = new int[col][row];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }

        return matrix2;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        print(transpose(matrix));
    }
}
