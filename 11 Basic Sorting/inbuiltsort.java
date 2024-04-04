import java.util.*;

public class inbuiltsort {
    public static void main(String args[])
    {                                    
        Integer[] arr = {2,6,1,7,3,8,};                                    
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());





        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
