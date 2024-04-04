public class selecrtion {

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
                // swap
                int temp = arr[minpos];
                arr[minpos] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 12, 14, 6, 18, 10 };
        selection(arr);
        printarr(arr);
    }
}
