package Part1;

import java.util.Scanner;
// Приветствовать любого пользователя при вводе его имени через командную строку
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        System.out.println("Привет, " + a);
    }
}

