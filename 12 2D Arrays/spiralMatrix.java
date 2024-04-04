public class spiralMatrix {

    public static void spiralMatrix(int matrix[][]) {
        int startCol = 0;
        int startRow = 0;
        int endCol = matrix[0].length - 1;
        int endRow = matrix.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top , Fixed - startRow , go startcol to endCol

            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // Right , Fixed - endCol , go startRow to endRow

            for (int i = startRow + 1; i <= endRow-1; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom , Fixed - endRow , go endcol to startCol

            for (int i = endCol ; i > startCol; i--) {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            // Left , Fixed - startCol , go endRow to startRow

            for (int i = endRow ; i >= startRow+1; i--) {
                if(endCol==startCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // kata piti

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 }
        };

        spiralMatrix(matrix);
    }

}
