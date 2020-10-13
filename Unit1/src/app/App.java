package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
System.out.println("please enter a number.");
String name = input.nextLine();


System.out.println("please enter another number.");
String number = input.nextLine();

System.out.println("the numbers are " + name + number);

    }
}