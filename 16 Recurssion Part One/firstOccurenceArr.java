public class firstOccurenceArr {

    public static int firstOccurence(int arr[], int key , int index){
        if(key == arr[index]){
            return index;
        }
        if (index == arr.length - 1){
            return -1;
        }
        return firstOccurence(arr, key, index + 1);
    }

    public static void main(String args[])
    {                                    
     int arr[] = {2,3,4,6,6,7,3,2,1,5};                                    
    System.out.println(firstOccurence(arr, 17, 0));
    }
}
