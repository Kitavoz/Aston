import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(Task5(12, 5) + "\n");
        Task6(-4);
        System.out.println(Task7(-5) + "\n");
        Task8("Aston", 5);
        System.out.println(Task9(2023) + "\n");
        Task10();
        Task11();
        Task12();
        Task13(5);
        for (int i : Task14(6, 2)) {
            System.out.print(i + " ");
        }
    }

    //Первое задание
    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");
    }

    //Второе задание
    public static void checkSumSign() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a и b:  ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a + b >= 0)
            System.out.println("Сумма положительная\n");
        else
            System.out.println("Сумма отрицательная\n");
    }

    //Третье задание
    public static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение:  ");
        int value = in.nextInt();
        if (value <= 0)
            System.out.println("Красный\n");
        else if (value <= 100)
            System.out.println("Жёлтый\n");
        else
            System.out.println("Зелёный\n");
    }

    //Четвертое задание
    static public void compareNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a и b:  ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a >= b)
            System.out.println(a + ">=" + b + "\n");
        else
            System.out.println(a + "<" + b + "\n");
    }

    //Пятое задание
    static public boolean Task5(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //Шестое задание
    static public void Task6(int a) {
        if (a >= 0)
            System.out.println("Положительное\n");
        else
            System.out.println("Отрицательное\n");
    }

    //Седьмое задание
    static public boolean Task7(int a) {
        return a < 0;
    }

    //Восьмое задание
    static public void Task8(String str, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(str);
        }
        System.out.println();
    }

    //Девятое задание
    static public boolean Task9(int a) {
        return a % 4 == 0 && (a % 100 != 0 || a % 400 == 0);
    }

    //Десятое задание
    static public void Task10() {
        int[] a = {1, 1, 1, 0, 0, 0, 1, 0, 1};
        for (int i : a) System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                a[i] = 1;
            else if (a[i] == 1)
                a[i] = 0;
        }
        for (int i : a) System.out.print(i + " ");
        System.out.println("\n");
    }

    //Одинадцатое задание
    static public void Task11() {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++)
            a[i] = i + 1;
        for (int i = 0; i < 100; i++)
            System.out.print(a[i] + " ");
        System.out.println("\n");
    }

    //Двенадцатое задание
    static public void Task12() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : a) System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6)
                a[i] *= 2;
        }
        for (int i : a) System.out.print(i + " ");
        System.out.println("\n");
    }

    //Тринадцатое задание
    static public void Task13(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || n - 1 - i == j)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Четырнадцатое задание
    static public int[] Task14(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}