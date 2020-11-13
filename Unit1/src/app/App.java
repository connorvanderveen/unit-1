package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
Scanner input = new Scanner(System.in);

int targetNum =25;
boolean isFinished = false;
while (isFinished == false){
System.out.println("choose a number 0-100");
int guess = input.nextInt();
input.nextLine();
if (guess == targetNum){
    System.out.println("correct");
    isFinished = true;
}
else if (guess < targetNum){
    System.out.println("low");
}
else{
    System.out.println("high");
}
}

    }
}