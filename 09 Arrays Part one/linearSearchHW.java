public class linearSearchHW {

    public static int linearSearch(String menu[],String key)
    {
        for(int i = 0;i<menu.length;i++)
        {
            if(menu[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String[] menu = { "rooti", "cha", "Coffe", "Sabji" };
        String key = "Sabji";
        int result = linearSearch(menu, key);
        System.out.println(result);

    }
}
