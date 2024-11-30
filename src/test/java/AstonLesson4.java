import java.util.Arrays;

public class AstonLesson4 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        boolean b = testFive(5, 5);{
            System.out.println("Задание 5");
            System.out.println(b);
        };
        testSix(6);
        boolean b1 = testSeven(0);{
            System.out.println("Задание 7");
            System.out.println(b1);
        }
        testEight("qwerty", 5);
        System.out.println("Задание 9");
        System.out.println(testNine(2024));
        testTen();
        test11();
        test12();
        test14(50,5);
    }

    public static void printThreeWords() {
        System.out.println("Задание 1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSing()

    {
        int a, b, c;
        a = 1;
        b = 1;
        c = a + b;
        if (c >= 0){
            System.out.println("Задание 2");
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Задание 2");
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 100;
        if (value <= 0){
            System.out.println("Задание 3");
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Задание 3");
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Задание 3");
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers(){
        int a, b;
        a = 1;
        b = 2;
        if (a >= b){
            System.out.println("Задание 4");
            System.out.println("a >= b");
        }  else System.out.println("Задание 4");
        System.out.println("a < b");
    }
    public static boolean testFive(int a, int b){
        int c = a + b;
        return  (c >= 10 && c <= 20);
    }

    public static void testSix(int number){
        if (number < 0){
            System.out.println("Задание 6");
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Задание 6");
            System.out.println("Положительное число");
        }
    }
    public static boolean testSeven(int a){
        return (a < 0);
    }

    public static void testEight(String a, int b) {
        System.out.println("Задание 8");
        for (int c = 0; c < b; c++) {
            System.out.println(a);
        }
    }
    public static boolean testNine(int year){
       return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void testTen() {
        int [] arr = {1, 0, 1, 1, 0,1};
        for (int i = 0; i > arr.length; i++){
            if (arr [i] == 1){
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println("Задание 10");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void test11() {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        System.out.println(" ");
        System.out.println("Задание 11");
        for (int num : arr){
            System.out.print(num + " ");
        }

    }
    public static void test12() {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr [i] < 6){
                arr[i] *= 2;
            }
            }
        System.out.println(" ");
        System.out.println("Задание 12");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
   /* public static void test13() {
        /int size = 3;
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; i < table[i].length; j++){
                if ()
            }
        }
    }*/

    public static void test14(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(" ");
        System.out.println("Задание 14");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

