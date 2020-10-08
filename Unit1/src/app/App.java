package app;

public class App {
    public static void main(String[] args) throws Exception {
int count = 0;

      while (count < 1001) {
          System.out.println("the count is " + count);
          count = count + 100;
      }
      
      System.out.println("count finished");
    }
}