public class revnum {
    public static void main(String[] args) {
        int number = 324786;
        int rem = 0;
        while(number > 0)        
        {
            rem =  number%10;
            System.out.print(rem + " ");
            number = number / 10;
        }
        System.out.println();
    }
}
