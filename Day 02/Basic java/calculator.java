import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first value :");
        double a=sc.nextDouble();
        System.out.print("Enter the second value:");
        double b=sc.nextDouble();

        
        while (true) {
            System.out.println("What you want to do(+,-,*,/):");
            String op=sc.next();
            switch(op){
                case "+":
                    System.out.println("Result:"+(a+b));
                    break;
                case "-":
                    System.out.println("Result:"+(a-b));
                    break;
                case "*":
                    System.out.println("Result:"+(a*b));
                    break;
                case "/":
                    System.out.println("Result:"+(a/b));
                    break;
                case "exit":
                    break;
            }  
                
        }

        }
    }

