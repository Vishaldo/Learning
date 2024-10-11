
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scan.nextLine();
        System.out.print("Mark :");
        double Mark = scan.nextDouble();
        scan.nextLine();
        System.out.print("Department : ");
        String Dept = scan.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Mark: " + Mark/10 + "/10");
        System.out.println("Department : " + Dept);
}
        
    }
