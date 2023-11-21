
import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;
public class Main {

    //Переменная для объекта считывающего из консоли
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        //Переменная для номера задания, тип байт
        byte taskNumber = 0;



        do {
            //Приглашение
            System.out.printf("Введите номер задания от 1-8. (0 - завершение): ");

            taskNumber = scan.nextByte();

            switch (taskNumber){
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task6();
                    break;
                case 7:
                    task7();
                    break;

            }
        }while (taskNumber !=0);

    }

    public static void task1(){

        System.out.printf("Введите два числа - диапазон выводимых чисел (разделитель - пробел): ");

        //Считаем диапазон выводимых чисел
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();

        //Переменная для массива. Объявление.
        int[] numbers = new int[endNumber-startNumber + 1];

        for (int i=startNumber; i<=endNumber; i++){
            numbers[i-startNumber] = i;
            System.out.println("Число " + (i-startNumber) + ": " + numbers[i-startNumber]);
        }
    }

    public static void task2(){

        System.out.printf("Введите два числа - диапазон выводимых чётных чисел (разделитель - пробел): ");

        //Начальный и конечный число диапазона
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();

        //Массив
        int[] numbers = new int[(endNumber - startNumber + 1)];

        if (startNumber % 2 != 0){
            startNumber++;
        }

        //Счётчик по циклу
        int j=0;
        for (int i=startNumber; i<=endNumber; i+=2){
            numbers[j] = i;
            System.out.printf("число " + j + " - " + numbers[j++] + "; ");
        }
        System.out.println();
    }

    public static void task3(){

        System.out.println("Введите 2 числа - диапазон выводимых нечётных чисел (разделитель - пробел): ");

        //Диапазон чисел
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();

        //Нормализация
        if(startNumber > endNumber){
            int tmp = startNumber;
            startNumber = endNumber;
            endNumber = tmp;
        }

        //Массив
        int[] numbers = new int[endNumber - startNumber + 1];

        //Сместим номер
        if (startNumber % 2 == 0){
            startNumber++;
        }

        System.out.println("Нечётные числа из диапазона:");

        int j = 0;
        for(int i=startNumber; i<=endNumber; i+=2){
            numbers[j] = i;
            System.out.printf("Число " + j + " - " + numbers[j++] + "; ");
        }
        System.out.println();
    }

    public static void task4(){

        System.out.println("Введите число: ");

        int number = scan.nextInt();

        if (number == 1){
            System.out.println(1);
            System.exit(0);
        }

        int factorial = 1;


        for(int i=2; i<= number; i++){
            factorial *= i;
        }
        System.out.println("Факториал введённого числа = " + factorial);
    }

    public static void task5(){

        System.out.println("Введите длину выводимой линии: ");

        int length = scan.nextInt();

        for(int i=0; i<= length; i++){
            System.out.printf("*");
        }
        System.out.println();
    }

    public static void task6() {

        System.out.println("Введите символ из которого будет построена линия: ");
        String symbol = scan.nextLine();

        System.out.println("Введите длину выводимой линии: ");

        int length = scan.nextInt();

        for (int i = 0; i <= length; i++) {
            System.out.printf(symbol);
        }
        System.out.println();
    }

    public static void task7() {

        System.out.println("Введите 2 числа - диапазон выводимых нечётных чисел (разделитель - пробел): ");

        //Диапазон чисел
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();

        //Нормализация
        if(startNumber > endNumber){
            int tmp = startNumber;
            startNumber = endNumber;
            endNumber = tmp;
        }

        //Массив
        int[] numbers = new int[endNumber - startNumber + 1];

        for (int i=startNumber; i<=endNumber; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.printf("FizzBuzz  ");
            } else if (i % 3 == 0) {
                System.out.printf("Fizz  ");
            } else if (i % 5 == 0) {
                System.out.printf("Buzz  ");
            }

        }
        System.out.println();
    }
}