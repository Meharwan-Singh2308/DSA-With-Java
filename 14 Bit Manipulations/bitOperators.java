public class bitOperators {
    public static void main(String[] args) {
            //System.out.println((5 & 6));
            // Output : 4
            // The explaination is that 
            // 5 & 6 = 4
            // 5 = 101
            // 6 = 110
            // 4 = 001
            // the bit wise AND tells that if a binary numbers is
            // 1 and 0, then the result is 0.
            // 1 and 1 , then the result is 1.

            // System.out.println(5 | 6);
            // Output : 7
            // the explaination is that
            // 5 | 6 = 7
            //the bit wise OR tells that if a binary number is 
            // 1 or 0, then the result is 1.
            // 1 or 1, then the result is 1.
            // 0 or 0, then the result is 0.
            // 0 or 1, then the result is 1.

            // 5 = 101
            // 6 = 110
            // 7 = 111


            // System.out.println( 5 ^ 6);
            //Output : 3
            // the explaination is that
            // 5 ^ 6 = 3
            // 5 = 101
            // 6 = 110
            // 3 = 011
            // the bit wise XOR tells that if a binary numbers is
            // 1 and 0, then the result is 1.
            // 1 and 1, then the result is 0.
            // 0 and 0, then the result is 0.
            // 0 and 1, then the result is 1.


            // System.out.println(~5);
            //Output : -6
            // the explaination is on notebook
            // the bit wise NOT tells that if a binary numbers is
            // 1, then the result is 0.
            // 0, then the result is 1.

            System.out.println(5<<2);
            //output : 20
            //the explaination is on notebook

            System.out.println(6>>1);
            //output : 3
            //the explaination is on notebook


        }   
}