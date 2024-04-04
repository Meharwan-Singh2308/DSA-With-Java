public class insrtionsort {

    public static void insertionsort(int[] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert 
            while(prev>= 0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--; 
            } 
            //insertion 
            arr[prev+1] = curr;
        }

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String args[])
    {                                    
        int[] arr = {2,4,16,8,10};
        insertionsort(arr);        
        
    }
}