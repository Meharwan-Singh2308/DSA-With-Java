public class leetcode {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0;i<nums.length ;i++)
        {
            for(int j = i+1;i<nums.length;)
            {
                if(nums[i] + nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
            
        }
        return result;

    }

    public static void main(String args[])
    {                                    
    }
}
