import java.util.*;

public class pr1ton {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    int user  = sc.nextInt() , counter = 1;
    sc.close();
    while (counter <=user){
        System.out.print(counter++ + " ");        
    }
}
}
