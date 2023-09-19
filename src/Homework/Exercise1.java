package Homework;

import java.util.Scanner;

public class Exercise1 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите колличество секунд, которые необходимо перевести в часы и минуты");
    long seconds = scanner.nextLong();
    long sec = seconds % 60;
    long min = (seconds / 60) % 60;
    long hour = (seconds / 60) / 60;
    System.out.println("hours = "+hour +" minutes = "+min +" seconds = "+sec);
}
}
