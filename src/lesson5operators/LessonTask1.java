package lesson5operators;

import java.util.Scanner;

public class LessonTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        float s;
        double area;
        System.out.println("Enter 3 sides of a Triangle");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        s = (a + b + c) / 2f;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area is: " + area);
    }
}
