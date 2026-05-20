import java.util.Scanner;

public class if_else{
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);

        System.out.print("Enter your age:");
        int age=cs.nextInt();

        if(age>=18){
            System.out.println("You are valid to vote!");
        }
        else if(age>0 && age<18){
            System.out.println("You are teenager!");
        }
        else{
            System.out.println("Enter the valid age!");
        }
    }
}