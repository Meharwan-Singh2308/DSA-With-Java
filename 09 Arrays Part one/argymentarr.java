public class argymentarr {

    public static void update(int marks[])
    {
        for(int i = 0;i<marks.length;i++)
        {
            marks[i] += 1; 
        }
    }


    public static void main(String args[])
    {                                    
        int marks[] = {12,34,54};                                     

        update(marks);

        for(int i = 0;i<marks.length;i++)
        {
            System.out.print(marks[i] + " ");
        }
    }


}