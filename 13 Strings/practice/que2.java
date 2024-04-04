package practice;

import java.util.Arrays;

public class que2 {

    public static boolean anagramChecker(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int arr1[] = new int[str1.length()];

        int arr2[] = new int[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            arr2[i] = str2.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String str1 = "racer";
        String str2 = "carec";

        System.out.println(anagramChecker(str1, str2));
    }
}
