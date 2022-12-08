package Seminar_DZ;
/**
 * Решение реализованное в методе main!!!
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DZ_seminar_1 {

    public static void main(String[] args) throws IOException {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
        int Min = 0;
        int Max = 2_000;
        int i = Min + (int)(Math.random() * ((Max - Min) + 1));
        System.out.println("(Ответ 1) Случайное целое число в диапазоне от 0 до 2000: i = " + i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
        int bin = Integer.toBinaryString(i).length();
        System.out.println("\n(Ответ 2) \nВыпавшее число i = " + i);
        System.out.print("Число i в двоичном формате = ");
        System.out.println(Integer.toBinaryString(i));
        System.out.println("Номер старшего значащего бита выпавшего числа i: n = " + bin);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int j = i + 1; j <= Max; j++) {
            if (j % bin == 0) {
                list1.add(j);
            }   
        }
        ArrayList<Integer> m1 = list1;
        System.out.print("\n(Ответ 3) \nВсе кратные n числа в диапазоне от i до Short.MAX_VALUE: " + m1);
        FileWriter writer1 = new FileWriter("Seminar_DZ/m1.txt");
        for (Integer c : m1) {
            writer1.write(c + "\t");
        }
        writer1.close();

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int j = i - 1; j >= Min; j--) {
            if (j % bin != 0) {
                list2.add(j);
            }
        }
        ArrayList<Integer> m2 = list2;
        System.out.print("\n(Ответ 4) \nВсе некратные n числа в диапазоне от Short.MIN_VALUE до i: " + m2);
        FileWriter writer2 = new FileWriter("Seminar_DZ/m2.txt");
        for (Integer c : m2) {
            writer2.write(c + "\t");
        }
         writer2.close();
    }
}
