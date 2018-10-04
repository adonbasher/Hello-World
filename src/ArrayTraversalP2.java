import java.util.Arrays;

public class ArrayTraversalP2 {
    public static void main(String[] args) {
        int[] array = {5, 8, 7, 12,};
        aidansAlgo(array);
    }

    public static void aidansAlgo(int[] aa) {
        int x;
        for (int y = 0; y < aa.length / 2; y++) {
            x = aa[y];
            aa[y] = aa[aa.length - y - 1];
            aa[aa.length - y - 1] = x;
        }
        System.out.println(Arrays.toString(aa));
    }
}
