public class addition {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;

        int sum = additionMeth(num1, num2);

        System.out.println("Sum: " + sum);
    }

    public static int additionMeth(int num1, int num2) {
        return num1 + num2;
    }
}
