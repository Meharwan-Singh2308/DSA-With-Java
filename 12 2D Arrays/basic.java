import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2D Arrays !!");
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}