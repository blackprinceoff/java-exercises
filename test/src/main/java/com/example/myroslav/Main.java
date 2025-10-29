package com.example.myroslav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1.Hello and Name Printer
        System.out.println("Hello\nMyroslav");

        // 2.Sum of Two Numbers
        System.out.println(74 + 36);

        // 3.Division of Two Numbers
        int div = 50/3;
        System.out.println(div);

        // 4.Arithmetic Operations
        int a4 = -5 + 8 * 6;
        int b4 = (55 + 9) % 9;
        int c4 = 20 + -3 * 5 / 8;
        int d4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a4 + "\n" + b4 + "\n" + c4 + "\n" + d4);

        // 5.Product of Two Numbers
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x5 = sc5.nextInt();
        System.out.print("Input second number: ");
        int y5 = sc5.nextInt();
        System.out.println(x5 + " x " + y5 + " = " + x5 * y5);

        // 6. Basic Arithmetic Operations
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x6 = sc6.nextInt();
        System.out.print("Input second number: ");
        int y6 = sc6.nextInt();
        int sum6 = x6 + y6;
        int sub6 = x6 - y6;
        int mul6 = x6 * y6;
        int div6 = x6 / y6;
        int mod6 = x6 % y6;
        System.out.println(x6 + " + " + y6 + " = " + sum6);
        System.out.println(x6 + " - " + y6 + " = " + sub6);
        System.out.println(x6 + " * " + y6 + " = " + mul6);
        System.out.println(x6 + " / " + y6 + " = " + div6);
        System.out.println(x6 + " % " + y6 + " = " + mod6);

        // 7. Multiplication Table
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num7 = sc7.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num7 + " * " + i + " = " + (num7 * i));
        }

        // 8. Pattern Display: JAVA
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        // 9. Expression Evaluation
        double num9 = (25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5);
        System.out.println(num9);

        // 10. Formula Computation
        double num10 = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(num10);

        // 11. Circle: Area and Perimeter
        double r11 = 7.5;
        double per11 = 2 * Math.PI * r11; 
        double area11 = r11 * r11 * Math.PI;
        System.out.println("Perimeter is " + per11);
        System.out.println("Area is " + area11);

        // 12. Average of Three Numbers
        Scanner sc8 = new Scanner(System.in);
        System.out.print("input number 1: ");
        int num1 = sc8.nextInt();
        System.out.print("input number 2: ");
        int num2 = sc8.nextInt();
        System.out.println("input number 3: ");
        int num3 = sc8.nextInt();

        int avg = (num1 + num2 + num3) / 3;
        System.out.println("The average number is: " + avg);
    }
}