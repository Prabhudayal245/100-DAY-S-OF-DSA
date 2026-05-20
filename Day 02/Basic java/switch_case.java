import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the today's day:");
        String day=sc.nextLine();

        switch(day){
            case "Monday":
                System.out.println("The day is monday!");
                break;
            case "Tuesday":
                System.out.println("It is tuesday!");
                break;
            case "Invalid":
                System.out.println("Invalid day");
                break;
        }
    }
}
