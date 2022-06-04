package Part1;

import java.util.Scanner;
// Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Задайте число аргументов:");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int s = 0;
        int p = 1;
        System.out.println("Введите сами аргументы:");
        for (int i = 1; i <= n; i++) {
            int k = console.nextInt();
            s = s + k;
            p = p * k;
        }
        System.out.println("Сумма введенных чисел равна:" + s);
        System.out.println("Произведение введенных чисел равна:" + p);
    }
}
