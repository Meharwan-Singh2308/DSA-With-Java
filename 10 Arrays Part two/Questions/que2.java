public class que2 {
    // [4, 5, 6, 7, 0, 1, 2], target = 0

    public static int serchInSortedArray(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] ==target)return mid;

            if(nums[mid] > nums[low]){
                if(nums[low] <= target && nums[mid] >=target){
                    high = mid - 1;
                }
                else {
                    low = mid +1;
                }
            }
            else {
                if(nums[low] <= target && nums[high] >= target)
                {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            }
            return -1;
    }

    public static void main(String[] args) {
        //4,  5, 6, 7, 0, 1, 2], target = 3
        int nums[] = {3,1};
        int target = 1;
        System.out.println(serchInSortedArray(nums,target));
    }
}