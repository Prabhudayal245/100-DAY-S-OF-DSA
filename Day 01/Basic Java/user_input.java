import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       System.out.print("Enter the full name:");
       String name=sc.nextLine();
       System.out.println("Welcome!! "+name);

       System.out.print("Enter the value of a:");
       int a=sc.nextInt();
       System.out.print("Enter the value of b:");
       int b=sc.nextInt();

       System.out.println("the sum of a and b is:"+(a+b));
    }
}
