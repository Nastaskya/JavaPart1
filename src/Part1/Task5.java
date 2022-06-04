package Part1;

import java.util.Scanner;
// Ввести число от 1 до 12.
// Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Задайте число от 1 до 12:");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n == 1) {
            System.out.println("Январь");
        } else if (n == 2) {
            System.out.println("Февраль");
        } else if (n == 3) {
            System.out.println("Март");
        } else if (n == 4) {
            System.out.println("Апрель");
        } else if (n == 5) {
            System.out.println("Май");
        } else if (n == 6) {
            System.out.println("Июнь");
        } else if (n == 7) {
            System.out.println("Июль");
        } else if (n == 8) {
            System.out.println("Август");
        } else if (n == 9) {
            System.out.println("Сентябрь");
        } else if (n == 10) {
            System.out.println("Октябрь");
        } else if (n == 11) {
            System.out.println("Ноябрь");
        } else if (n == 12) {
            System.out.println("Декабрь");
        }
    }
}
