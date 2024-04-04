import java.util.*;




// doubted and confussion 🔥🔥🔥//solved

public class inccla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double tax;
        if (salary < 500000) {
            System.out.println("your salary is " + salary);
        } else if (salary > 500000 && salary < 1000000) {
            tax = 0.2;
            salary = (int) (tax * salary);
            System.out.println(salary);

        } else {
            tax = 0.3;
            salary = (int) (salary * tax);
            System.out.println("your salary is " + salary);
        }
    }
}
