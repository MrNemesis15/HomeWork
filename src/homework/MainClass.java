package homework;
//Домашнее задание

public class MainClass {
    public static void main(String[] args) {

        //Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
// Класс создан далнейшее задани буду выполнять в данном классе.
//        printThreeWords ();
//        checkSumSign ();
//        printColor ();
//        compareNumbers ();
        System.out.println (twoNumbers (10, 7));
        valueNumber (-10);
        System.out.println (isNegative (-1));
        printWordMulti ("Hello", 5);
        System.out.println (isYear (2021));
    }

    //Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
//Orange
//Banana
//Apple

//    public static void printThreeWords() {
//        System.out.println ("Orange");
//        System.out.println ("Banana");
//        System.out.println ("Apple");
//    }
//
//    //Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
////Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
////в противном случае - “Сумма отрицательная”;
//    public static void checkSumSign() {
//        int a = -10;
//        int b = 5;
//        int c = a + b;
//        System.out.println (c);
//        if (c >= 0) System.out.println ("Сумма положительная");
//        if (c <= 0) System.out.println ("Сумма отрицательная");
//    }
//
//    //Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
////Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
////если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
//    public static void printColor() {
//        int value = (int) (Math.random () * 200 - 50);
//        if (value <= 0) System.out.println ("Красный");
//        if (value > 0 && value <= 100) System.out.println ("Желтый");
//        else if (value >= 100) System.out.println ("Зеленый");
//    }
//    //Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
//    // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
//
//    public static void compareNumbers() {
//        int a = 7;
//        int b = 13;
//        if (a >= b) System.out.println ("a >= b");
//        if (a <= b) System.out.println ("a < b");
//    }
////Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
//// Все методы вызываються из класса мейн.

    //    Домашнее задание №2
//Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//
//
//
    public static boolean twoNumbers(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
    public static void valueNumber(int a) {
        if (a >= 0) System.out.println ("Число положительное");
        else System.out.println ("Число отрицательное");
    }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int x) {
        if (x >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWordMulti(String c, int i) {
        for (i = i; i <= 20; i *= 2) {
            System.out.println (c);
        }
    }

    //* Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else return false;
    }
}










