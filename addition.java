public class addition {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;

        int sum = AdditionMeth(num1, num2);
        int sub = SubMeth(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
    }

    public static int AdditionMeth(int num1, int num2) {
        return num1 + num2;
    }
     public static int SubMeth(int num1, int num2) {
        return num1 + num2;
    }

    public void printGreeting() {
        System.out.println("Hello from Sam Keller");
    }

     public void printGreeting() {
        System.out.println("Hi from Esha Attiq");
    }
}
