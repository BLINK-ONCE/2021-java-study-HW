import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        System.out.println("이름은 " + name + ", ");

        String city = scan.next();
        System.out.println("도시는 " + city + ", ");

        int age = scan.nextInt();
        System.out.println("나이는 " + age + "살, ");

        double weight = scan.nextDouble();
        System.out.println("체중은 " + weight + "kg, ");

        boolean single = scan.nextBoolean();
        System.out.println("독신 여부는 " + single + "입니다.");

        scan.close();
    }
}
