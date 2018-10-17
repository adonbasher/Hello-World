//This program takes a number and prints the mode.
public class AidanDamianoMode {
    public static void main(String[] cheese) {
        int numb = 57135203;
        System.out.println(mode(numb));
    }

    //This method finds the mode.
    public static int mode(int x) {
        int num = x;
        int count = 0;
        //Finds the amount of digits in the number.
        while (num != 0) {
            num /= 10;
            //Apparently you can do ++count :)
            ++count;
        }
        int[] numb = new int[10];
        int j;
        //Adds one to the correct index of the array every time a digit appears.
        for (int y = 0; y < count; y++) {
            j = x % 10;
            x /= 10;
            ++numb[j];
        }
        int w = -1;
        //Finds greatest value in the array.
        for (int y = 0; y < 10; y++) {
            if (numb[y] > w) {
                w = y;
            }
        }
        return w;
    }
}
