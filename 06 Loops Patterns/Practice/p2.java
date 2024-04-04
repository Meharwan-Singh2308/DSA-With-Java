public class p2 {
    public static void main(String[] args) {
        int n = 40;
        int space = 1;//✅ 
        //space = n - line 
        //star = line
        for(int line = 1 ;line <= n;line++)
        {
            for(space =1;space<=n-line ;space++)
            {
                System.out.print(" ");

            }
            space--;
            for(int star = 1;star<= n- space;star++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}