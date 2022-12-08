package Seminar_Task;
/**
 * Task_01
 */
import java.util.Arrays;
import java.util.Random;

public class Task_01 {

    public static void main(String[] args) {

        int a = 4;
        System.out.println(a);

        double d = 16.4;
        System.out.println(d);

        float f = 4.2f;
        System.out.println(f);

        long l = 34;
        System.out.println(l);

        short s = 2;
        System.out.println(s);

        byte b = 12;
        System.out.println(b);

        boolean bool = true;
        System.out.println(bool);

        char ch = 'q';
        System.out.println(ch);

        int[] ints = new int[10];
        ints[0] = ints[2] = 8;
        if (a <= 9) {
            a = 2;
        } else if (a > 10) {
            a = 18;
        } else {
            a = 0;
        }
        int ap = 0;
        Random random = new Random();
        random.setSeed(10289);
        for (int i = 0; i < 10; i++, ap++) {
            ints[i] = random.nextInt(1024);
            //ints[i] = new Random().nextInt(1024);
        }
        System.out.println(ap);
        for (int i : ints) {
            System.out.println(i);
        }

        String str = "Hello + World!";
        String str2 = new String("ivanov ivan ivanovich");
        System.out.println(str + " " + str2);
        System.out.println("Hello");
        System.out.println(str.toLowerCase());        
        System.out.println(str.toUpperCase());
        System.out.println(str);
        
        if (str.equals("Helloooo!")) {
            System.out.println(String.valueOf(true));
        } else {
            System.out.println(false);
        }

        str.charAt(str.length()/2);

        str.replace("+", "plus");
        System.out.println(str.replace("+", "plus"));

        System.out.println("Hello".repeat(4));

        str2.split(" ");

        String[] tmp = str2.split(" ");
        System.out.println(tmp[0] + " " + tmp[1].toUpperCase().charAt(0) + " " + tmp[2].toUpperCase().charAt(0) + ".");

        str.trim();

        String t1 = str.subSequence(1, 4).toString();
        System.out.println(t1);

        str.substring(str.length()/2);
        str.substring(2, 5);
        str.strip();

        int[] ints1 = {1, 4, 8, 16, 164, 444};
        System.out.println(Arrays.toString(ints1));
        System.out.println(ints1[1]);

        Arrays.fill(ints, new Random().nextInt());
        int[] ints2 = Arrays.copyOf(ints, ints.length);
        System.out.println(Arrays.toString(ints2));

        Arrays.sort(ints1);
        System.out.println(Arrays.toString(ints1));

        System.out.println(Arrays.binarySearch(ints1, 444));

        int[][] ints3 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(Arrays.deepToString(ints3));
    }
}
