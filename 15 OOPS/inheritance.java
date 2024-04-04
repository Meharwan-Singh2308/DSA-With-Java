import java.lang.management.ManagementFactory;

public class inheritance {
    public static void main(String args[])
    {               
        Fish shark = new Fish();
        Mamal insaan = new Mamal();
        Bird moor = new Bird();
    }
}

class Animal{
    String color;

    void eat()
    {
        System.out.println("eats");
    }

    void breath()
    {
        System.out.println("breaths");
    }
}

class Fish extends Animal {
    void swim()
    {
        System.out.println("swim");
    }
}

class Mamal extends Animal {
    void walk()
    {
        System.out.println("walk");
    }
}

class Bird {
    void fly()
    {
        System.out.println("fly");
    }
}















// class Mamal extends Animal{
//     int legs;
// }

//Multi level inheritance
// class Dog extends Mamal{
//     int breed;
// }














//Single level inheritance
// class Fish extends Animal{
//     int fins;

//     void swim()
//     {
//         System.out.println("swims in water");
//     }
// }

