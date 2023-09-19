package Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
        long age = scanner.nextLong();
        System.out.println("Как тебя зовут?");
        String name = scanner.next();
        System.out.println("Любимый вид спорта?");
        String sport = scanner.next();
        System.out.println("Чему равно число Пи?");
        double Pi = scanner.nextDouble();
        System.out.println("Назови свое любимое число от 1 до 10");
        byte FavoriteNumber1to10 = scanner.nextByte();
        System.out.println("А теперь назови от 1 до 100");
        short FavoriteNumber1to100 = scanner.nextShort();
        System.out.println("Сколько слов ты читаешь вслух за минуту?");
        int Read = scanner.nextInt();
        System.out.println("В каком году была Отечественная война?");
        long Date = scanner.nextLong();
        System.out.println("Кексики любишь?");
        String Cake = scanner.next();
        System.out.println("Смотрел винкс?");
        String Winx = scanner.next();
    }
}
        
