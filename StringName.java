import java.util.Scanner;

public class StringName {
   public static void main(String[] args) {
       String name;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String");
       name = sc.nextLine();
       sc.close();
       System.out.println(name);
   } 
}
