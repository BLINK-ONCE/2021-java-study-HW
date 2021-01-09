import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Test {
    static int[] makeArray(){
        int temp[] = new int[4];
        for (int i = 0; i < temp.length; i++) temp[i] = i;
        return temp;
    }
    public static void main(String[] args) {
        int intArray[] = makeArray();

        for (int i = 0; i < intArray.length; i++)System.out.print(intArray[i] + " ");

    }
}