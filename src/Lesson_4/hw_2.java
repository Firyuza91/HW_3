package Lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {

        // 1. C клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        // Пример: m=2, n=4
        // 8888
        // 8888

        for (int i = 1; i <= 2; i++) { // перенос или количество каретки
            for (int y = 1; y <= 4; y++) { // печать строчки
                System.out.print("8");
            }
            System.out.println(" ");
        }
        System.out.println("Конец первой задачи");

       2 // Вывести восьмерки
        //  8
        // 88
        // 888
        // 8888
        //  88888
        // 888888
        //  8888888
        //  88888888
        //  888888888
        //  8888888888

        for (int i = 0; i <= 10; i++) {  // перенос или количество каретки
            for (int s = 0; s <= i; s++) { // печать строчки

                System.out.print('8');
            }
            System.out.println();
        }

        System.out.println("Конец второй задачи");

        // 3 Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое
        // Если все числа равны, вывести любое из них.

        // System.out.println("Введите три числа");
        // Scanner scanner = new Scanner(System.in);
        // int[] numbers = new int[3];
        //for (int i = 0; i < numbers.length; i++) {
        //    numbers[i] = scanner.nextInt();
        //}
        // Arrays.sort(numbers);
        // System.out.println(numbers[1]);

        System.out.println("Конец четвертой задачи");

        //4
        //Вывести на экран таблицу умножения 10х10 используя цикл while.
        //Числа разделить пробелом.
        //Пример вывода на экран:
        //1 2 3 4 5 6 7 8 9 10
        //2 4 6 8 10 12 14 16 18 20
        //3 6 9 12 15 18 21 24 27 30
        //4 8 12 16 20 24 28 32 36 40
        //5 10 15 20 25 30 35 40 45 50
        //6 12 18 24 30 36 42 48 54 60
        //7 14 21 28 35 42 49 56 63 70
        //8 16 24 32 40 48 56 64 72 80
        //9 18 27 36 45 54 63 72 81 90
        //10 20 30 40 50 60 70 80 90 100

        int i = 1, n = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            while (n <= 9) {
                n++;
                System.out.print(i * n + " ");
            }
            i++;
            n = 1;
            System.out.println(" ");
        }
        System.out.println ("Конец 4 задачи");

            // 5 Ввести с клавиатуры строку name. Ввести с клавиатуры дату рождения (три числа): y, m, d.
            // Вывести на экран текст:
            // "Меня зовут name.
            // Я родился d.m.y"
            // Пример вывода:
            // Меня зовут Вася.
            // Я родился 15.2.1988

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя");
            String yorname = scanner.nextLine();

            System.out.print("Введите дату рождения: ");
            int date = scanner.nextInt();

            System.out.print("Введите месяц рождения ");
            int month = scanner.nextInt();

            System.out.print("Введите год рождения ");
            int year = scanner.nextInt();
            System.out.print("Меня зовут" + " " + yorname + "." + "Я родился в" + " " + date + "." + month + "." + year);
        }
    }




