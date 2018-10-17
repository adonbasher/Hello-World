import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int x = 111222333;


        randomArray();

    }

    public static void randomArray() {
        int x = (int) (Math.random() * 10 + 1);
        int[] aidan = new int[x];
        for (int y = 0; y < aidan.length; y++) {
            aidan[y] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(aidan));

    }

}
