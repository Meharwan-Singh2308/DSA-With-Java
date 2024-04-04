package practice;
public class ques3 {

    public static boolean palindrome(int n) {
       int palindrome = n;
       int reverse = 0;



       while(palindrome != 0)
       {
        int remainder = palindrome %10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
       }

       if(reverse == n)
       {
        return true;
       }

       return false;
        
    }

    public static void main(String args[]) {
        System.out.println(palindrome(1213));
    }
}
