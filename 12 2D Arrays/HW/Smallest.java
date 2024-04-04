package HW;

import java.util.*;

public class Smallest {

    public static int smallest(int matrix[][])
    {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }


    public static void main(String args[])
    {                          
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt() ;
            }
            System.out.println();
        }                
        for(int i = 0;i<n ;i++)
        {   
            for(int j = 0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }                    
        System.out.println(smallest(matrix));
    }

}
