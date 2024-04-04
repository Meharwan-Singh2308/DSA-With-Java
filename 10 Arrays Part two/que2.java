public class que2 {

    public static int searchSortedRotatedArray(int[] numbers, int n, int target) {
        // 4 5 6 7 0 1 2
        // ^
        // 0

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[start] < numbers[mid] && numbers[end] > numbers[mid]) {
                
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        int[] numbers = { 4, 5, 6, 7, 0, 1, 2 };
        int n = numbers.length;
        int target = 0;
        System.out.println(searchSortedRotatedArray(numbers, n, target));
    }
}
