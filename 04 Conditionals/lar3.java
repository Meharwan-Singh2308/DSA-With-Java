public class lar3 {
    public static void main(String[] args) {
        // int a = 12;
        // int b = 33;
        // int c = 4;

        // Another and best way to make variables

        int a = 12,b = 33, c = 4;

        //This is that which I do by myself 

        // if (a > b) {
        //     if (a > c) {
        //         System.out.println("A is the largest");
        //     } else {
        //         System.out.println("C is the largest");
        //     }
        // } else {
        //     if (b > c) {
        //         System.out.println("B is the largest");
        //     } else {
        //         System.out.println("C is the largest");
        //     }
        // }

        if( a >= b && a >=c)
        {
            System.out.print (" A is the largest ");
        }
        else if (b >= c)
        {
            System.out.println("B is the largest");
        }
        else
        {
            System.out.println(" C is the largest");
        }

    }
}
