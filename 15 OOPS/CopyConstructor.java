public class CopyConstructor {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Shardha";
        s1.roll = 23;
        s1.password = "kaise hooo";
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 92;

        Student s2 = new Student(s1);
        s2.password = "kaljdfl";

        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;
    
    Student() {
        marks = new int[3];
    }
    
    // deep copy constructor
    
    Student(Student s1) {
        this.marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
    

        for(int i = 0 ;i < 3 ;i++)
        {
            this.marks[i] = s1.marks[i];
        }
    }

    // Shallow copy constructor

    // Student(Student s1) {
    //     this.password = s1.password;
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = new int[3];
    //     this.marks = s1.marks; 
    // }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

}
