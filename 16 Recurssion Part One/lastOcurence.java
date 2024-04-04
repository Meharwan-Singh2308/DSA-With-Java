public class lastOcurence {

    public static int lastOccurence(int arr[], int key , int index){
        if( index == -1)
        {
            return -1;
        }
        if(key == arr[index])
        {
            return index;
        }

        return lastOccurence(arr, key, index - 1);
    }

    public static void main(String args[])
    {                                    
        int arr[] = {2,5,4,6,3,4,3,5,3,3};                                         
        System.out.println(lastOccurence(arr, 4, arr.length - 1));
    }
}
