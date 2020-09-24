package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.println("please enter you first name");
String firstname = input.nextLine();
System.out.println("please enter last name");                                               
String lastname = input.nextLine();
System.out.println("please enter age");
String age = input.nextLine();
System.out.println("please enter your grade");
String grade = input.nextLine();
System.out.println("please enter your favorite color");
String color = input.nextLine();
System.out.println("hello" + firstname + lastname + " you are in grade " + grade + "  and your favorite color is " + color);

        }
}