import java.util.Scanner;

public class binary_operator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of a:");
        double a=sc.nextDouble();
        System.out.print("Enter the value of b:");
        double b=sc.nextDouble();

        // binary operator 
        double sum=a+b;
        double sub=a-b;
        double mul=a*b;
        double div=a/b;
        double rem=a%b;

        System.out.println("sum:"+sum);
        System.out.println("sum:"+sub);
        System.out.println("sum:"+mul);
        System.out.println("sum:"+div);
        System.out.println("sum:"+rem);
    }
}