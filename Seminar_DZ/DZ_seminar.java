package Seminar_DZ;
/**
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DZ_seminar {

    // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
    public static int randomNum(int min, int max) {
        int num = (int) (Math.random() * ((max - min) + 1)) + min;
        return num;
    }

    // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
    public static int seniorBit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;
    }

    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
    public static ArrayList<Integer> arrayMult(int i, int n, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i + 1; j <= max; j++) {
            if (j % n == 0) {
                list.add(j);
            }
        }
        return list;
    }

    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                list.add(j);
            }
        }
        return list;
    }

    // Сохраняем оба массива в файлы с именами m1 и m2.
    public static void saveArray(ArrayList<Integer> arr, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (Integer c : arr) {
                writer.write(c + "\t");
                //writer.write(System.getProperty("line.separator")); // построчная запись
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int min = 0, max = 2_000;
        int i = randomNum(min, max);
        System.out.println("(Ответ 1) \nСлучайное число i в диапазоне от " + min + " до " + max + " = " + i);

        int n = seniorBit(i);
        System.out.print("\n(Ответ 2) \nЧисло i в двоичном формате = ");
        System.out.println(Integer.toBinaryString(i));
        System.out.println("Номер старшего значащего бита выпавшего числа i: n = " + n);

        ArrayList<Integer> m1 = arrayMult(i, n, max);
        System.out.print("\n(Ответ 3) \nВсе кратные n числа в диапазоне от i до Short.MAX_VALUE: " + m1);
        saveArray(m1, "Seminar_DZ/m1.txt");

        ArrayList<Integer> m2 = arrayNotMult(i, n, min);
        System.out.print("\n(Ответ 4) \nВсе некратные n числа в диапазоне от Short.MIN_VALUE до i: " + m2);
        saveArray(m2, "Seminar_DZ/m2.txt");
    }
}
