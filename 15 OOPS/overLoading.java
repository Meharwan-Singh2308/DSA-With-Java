public class overLoading {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,  3));
        System.out.println(calc.sum(1.5f, 1.4f));
        System.out.println(calc.sum(3, 7, 7));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
