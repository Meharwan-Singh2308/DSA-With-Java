public class checkArraySorted {
    public static boolean checkSorted(int[] arr, int n) {
        if (n == arr.length - 1) {
            return true;
        }
        if (arr[n] > arr[n + 1]) {
            return false;
        }
        return checkSorted(arr, n + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 7, 8 };
        System.out.println(checkSorted(arr, 0));
    }
}