package Part1;

import java.util.Scanner;
// Отобразить в окне консоли аргументы командной строки в обратном порядке
public class Task2 {
    public static void main(String[] args){
        System.out.println("Задайте число аргументов:");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] array = new int[n];
        System.out.println("Введите сами аргументы:");
        for ( int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }
        System.out.println("Аргументы в обратном порядке:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length-(i+1)]+" ");
        }
    }
}
