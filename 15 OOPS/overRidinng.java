


public class overRidinng {
    public static void main(String args[])
    {                                    
        Deer hiran = new Deer();
        hiran.eat();                                         
    }
}

class Animal{
    void breathe ()
    {
        System.out.println("Breathing ");
    }
    
    void eat()
    {
        System.out.println("eats anything");
    }
}


class Deer extends Animal {
    void eat ()
    {
        System.out.println("eats Grass");
    }
}
