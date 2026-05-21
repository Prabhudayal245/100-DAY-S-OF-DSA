import java.util.Scanner;

public class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your annual income:");
        double income=sc.nextDouble();

        if(income<=500000){
            System.out.println("Don't need to pay Tax");
        }

        else if(income>500000 && income<1000000){
            double tax=(10*income)/100;
            System.out.println("You need to pay 10% Tax of our amount");
            System.out.println("Your Tax amount is:"+tax);
        }
        else{
            double tax=(20*income)/100;
            System.out.println("You need to pay 20% of your tax");
            System.out.println("Your Tax amount is:"+tax);
        }

    }
}
