package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
Scanner input = new Scanner(System.in);
String password = "coolguy";
int tries = 0;
boolean secretMessageGiven = false;

while (tries < 3){
    if (secretMessageGiven == false){
System.out.println(" enter the password");
String enteredPassword = input.nextLine();

if (enteredPassword.equals(password)){
    System.out.println(" correct ");
    System.out.println(" have you heard of nord vpn ");
}
    }
}


    }
}