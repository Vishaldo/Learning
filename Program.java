import java.util.Scanner;

class Program {
    public static void main(String args[])
        {
            Scanner var1 = new Scanner(System.in);
            System.out.print("Enter your Name: ");
            String name = var1.nextLine();
            System.out.print("Age : ");
            int age = var1.nextInt();
            var1.nextLine();
            System.out.print("Address: ");
            String Address = var1.nextLine();
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Address : " + Address);

        }

}
