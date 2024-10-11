
import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scan.nextInt();
        System.out.print("Enter b : ");
        int b = scan.nextInt();
        System.out.print("Enter c : ");
        int c = scan.nextInt();
        int d = a*b*c;
        System.out.println(d);
        int e = a+b+c+d;
        System.out.println(e);

}

}