import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = br.readLine();
            if (s.isEmpty()) {
                System.out.print("-");
            }
        }

    }
}
