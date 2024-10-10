import java.util.Scanner;

class Program {
    public static void main(String args[])
        {
            Scanner var1 = new Scanner(System.in);
            Scanner var2 = new Scanner(System.in);
            System.out.print("Enter your Name: ");
            String name = var1.nextLine();
            System.out.print("Age : ");
            int age = var1.nextInt();
            System.out.print("Address: ");
            String Address = var2.nextLine();
            System.out.print("Name : " + name);
            System.out.print("Age : " + age);
            System.out.print("Address : " + Address);

        }

}
