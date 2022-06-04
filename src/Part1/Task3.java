package Part1;

import java.util.Scanner;
//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задайте количество случайных чисел:");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] array = new int[n];
        System.out.println("Введите сами числа:");
        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }
        System.out.println("Вывод чисел без перехода новую строку:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "Вывод чисел с переходом на новую строку:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
