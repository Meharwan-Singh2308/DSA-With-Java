public class Multiple_Interface {
    public static void main(String args[])
    {                                    
        Bear b = new Bear();
        b.eats_Meat();
        b.eats_grass();
    }
}

interface Harbivour{
    void eats_grass();
}

interface Carnivour{
    void eats_Meat();
}

class Bear implements Carnivour,Harbivour{
    public void eats_Meat() {
        System.out.println("eats Meat");        
    }
    public void eats_grass() {
        System.out.println("eats Grass");        
    }
}