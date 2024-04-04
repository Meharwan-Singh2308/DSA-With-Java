import java.util.*;
public class nrec {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row =  5;
    int column = 5;
    for(int i = 1; i <= row;i++)
    {
        for ( int j = 1; j<= column;j++)
        {
            if ( i == row || i == 1 || j == 1 || j == column)
            {
                System.out.print("*");
            }
            else{
            System.out.print(" ");
            }
        }
        System.out.println("");
    } 
    }
}

