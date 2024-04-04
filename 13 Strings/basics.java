import java.util.*;

public class basics {

    public static void pringLetters(String fullName )
    {
        for(int i= 0;i< fullName.length();i++)
        {
            System.out.print(fullName.charAt(i)+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        // char arr[] = {'a','b','c','d'};

        // String str = "abcd";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE
        
        //Input and Output


        // String name;
        // name = sc.nextLine();
        // System.out.println(name);


        // String fullName = "Tony Stark";

        // System.out.println(fullName.length());


        //Concatanation

        // String firstName = "Meharwan";
        // String lastName = " Singh";

        // String fullName = firstName + lastName;

        // System.out.println(fullName);
        
        //Char at Function 
        
        String firstName = "Meharwan";
        String lastName = " Singh";
        
        String fullName = firstName + lastName;
        
        pringLetters(fullName);

        // System.out.println(fullName.charAt(0));
        


    }
}