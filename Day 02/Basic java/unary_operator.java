import java.util.Scanner;

public class unary_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // pre increment
        int a=10;
        int b=a++;

        System.out.println("the value of a:"+a);
        System.out.println("the value of b:"+b);

        // post increment
        int c=13;
        int d=++c;
        System.out.println("the value of c:"+c);
        System.out.println("the value of d:"+d);
    }
}
