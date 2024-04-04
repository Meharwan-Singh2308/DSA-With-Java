public class Abstraction {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor Called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse()
    {
        System.out.println("Horse Constructor Called");
    }

    void changeColor() {
        color = "dark Brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang()
    {
        System.out.println("Mustang constructor Called");
    }
}









class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}