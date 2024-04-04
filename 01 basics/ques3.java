import java.util.*;

public class ques3 {
    /*
     * Question3:Enter cost of 3 items from the user(using float data type)
     * -a pencil,a pen and an eraser.
     * You have to output the total cost of the items back to the user as
     * their bill.(Add on : You can also try adding 18% gst tax to the items in the
     * bill as an advanced problem)
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    
    float pen = sc.nextFloat();
    
    float eraser = sc.nextFloat();

    float total = pencil + pen + eraser;

    System.out.println(total);
    
    float GST = (total * 18) / 100;

    System.out.println(GST);
    }

}
