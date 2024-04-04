public class sumsubarr {

    public static void subarray(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                currsum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    currsum += numbers[k];

                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Max Sum = " + maxsum);
    }

    public static void main(String args[]) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        subarray(numbers);
    }
}