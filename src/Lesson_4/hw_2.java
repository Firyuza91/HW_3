package Lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {

        // Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
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

        //
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

        System.out.println("Введите три числа");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[1]);
        scanner.close();

        System.out.println("Конец четвертой задачи");
    }

        // 5 Ввести с клавиатуры строку name. Ввести с клавиатуры дату рождения (три числа): y, m, d.
        // Вывести на экран текст:
        // "Меня зовут name.
        // Я родился d.m.y"
        // Пример вывода:
        // Меня зовут Вася.
        // Я родился 15.2.1988

         Scanner name = new Scanner(System.in);
        System.out.println("Введите имя и дату рождения");
        String yorname = scanner.nextLine();
        System.out.print("Input age: ");
        int date = scanner.nextInt();
        System.out.print("Input date ");
        System.out.printf("Мое имя" + yorname + " . " + "Я роидлся" +  date );
        scanner.close();

    }
}


