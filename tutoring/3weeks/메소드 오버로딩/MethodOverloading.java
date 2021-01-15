import java.util.Scanner;

public class MethodOverloading {
    public static int getSum(int i, int j) {
        return i + j;
    }

    public static int getSum(int i, int j, int k) {
        return i + j + k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(MethodOverloading.getSum(a, b));
        System.out.println(MethodOverloading.getSum(a, b, c));
    }
}
