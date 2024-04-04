package Questions;//✅

public class que1 {

    public static boolean isdistinct(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int nextnum = i + 1; nextnum <= numbers.length - 1; nextnum++) {
                if (numbers[i] == numbers[nextnum]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int[] numbers = { 1,1,1,3,3,4,3,2,4,2 };
        System.out.println(isdistinct(numbers));
    }
}
