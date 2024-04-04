public class SearchInSortedMatrix {


    public static boolean stairCaseAlgoritham(int martix[][] , int key)
    {
        int row = 0, col = martix[0].length-1;

        while(row < martix.length && col >= 0)
        {
            if(martix[row][col] == key)
            {
                System.out.println("The key found at (" + row +","+col+")");
                return true;
            }
            else if(key < martix[row][col] )
            {
                col--;
            }
            else{
                row++;
            }
        }


        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = { { 10, 20, 30, 40 },
                           { 15, 25, 35, 45 },
                           { 27, 29, 37, 48 },
                           { 32, 33, 39, 50 }
                
        };  

        int key = 30;
        stairCaseAlgoritham(matrix, key);
    }
}
