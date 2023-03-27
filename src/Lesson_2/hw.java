package Lesson_2;

public class hw {
    public static void main(String[] args) {

        // Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        double buh = 5;
        double cas = 2;
        double rub = buh/cas;
        System.out.println("в кассе лежит" + " " + rub + " " + "рубля");

       // Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
       // int a = 50;
        // int b = 20;
       // int square = a*b;
      //  System.out.println("площадь квадрата" + " " + square);

// Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
//насколько быстрее голодный Вася съедает один банан?

        int hangryTime = 9;
        int fullTime = 15;
        int bananas = 3;
        int hangryTimeVasya = hangryTime/bananas; //3
        int fullTimeVasya = fullTime/bananas; //5
        int differense = fullTime/bananas-hangryTime/bananas;
        System.out.println(differense);

       //  Задача 4. Закомментируй часть кода, чтобы на экран вывелось сообщение "sum = 12"
        int a = 3;
        // int a = 10;
         int b = 6;
        // int b = 12;
        //  int sum = 1 + a + b;
        // int sum = 2 + a + b;
        int sum = 3 + a + b;
        // int sum = 4 + a + b;
        System.out.println("sum = " + sum);

        // Задача 5. В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
        // Знаки нужно расставить только в строчке, в которой объявляется переменная result.
        // Порядок следования переменных в этой строке изменять нельзя.
       //  Перед каждой переменной должен стоять знак либо плюс, либо минус.

        //    int a = 1;
          //  int b = 3;
            // int c = 9;
           //  int d = 27;
            // int result = -a + b - c + d;
            //    System.out.println(result);
    }
   }