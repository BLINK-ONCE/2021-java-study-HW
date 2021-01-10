import java.util.HashMap;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        System.out.print("이름은 " + name + ", ");

        String city = scan.next();
        System.out.print(("도시는 " + city + ", "));

        int age = scan.nextInt();
        System.out.print("나이는 " + age + "살, ");

        double weight = scan.nextDouble();
        System.out.print("체중은 " + weight + "kg, ");

        boolean single = scan.nextBoolean();
        System.out.print("독신 여부는 " + single + "입니다. ");

        scan.close();
    }
}