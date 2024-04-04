public class sumsubarr2 {
   public static void subarray(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prifix[] = new int[numbers.length]; 

        prifix[0] = numbers[0];
        for(int i= 1;i<prifix.length;i++)
        {
            prifix[i] = prifix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                currsum = 0;
                int end = j;
     
                currsum = start == 0 ?prifix[end] : prifix[end] - prifix[i-1];

                // for (int k = start; k <= end; k++) {
                //     currsum += numbers[k];

                // }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Max Sum = " + maxsum);
    }

    public static void main(String args[]) {
        int[] numbers = { 1, -2, 6, -1, 3 };
        subarray(numbers);
    }
}
