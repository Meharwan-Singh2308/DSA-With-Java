package ASSINGNMENT;

public class que1 {

    public static int que1(int matrix[][] , int key)
    {
        int sum = 0;

        for(int row = 0;row < matrix.length;row++ )
        {
            for(int col = 0;col < matrix[0].length;col++)
            {
                if(matrix[row][col] == key )
                {
                    sum += 1;
                }
            }
        }

        return sum;
    }

    public static void main(String args[])
    {                                    
        int matrix[][] = {{4,7,8},{8,8,7}};                                    
        int key = 8;
        System.out.println(que1(matrix, key));
    }
}
