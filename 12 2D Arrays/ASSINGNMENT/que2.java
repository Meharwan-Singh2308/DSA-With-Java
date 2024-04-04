package ASSINGNMENT;

public class que2 {

    public static int que2(int matrix[][] , int key)
    {   
        int sum = 0;

        for(int col = 0 ; col < matrix[key].length ; col++ )
        {
            sum += matrix[key][col]; 
        }

        return sum;
    }
  
    public static void main(String args[]) {
        int matrix[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };

        int key = 1;
        System.out.println(que2(matrix, key));
    }
}
