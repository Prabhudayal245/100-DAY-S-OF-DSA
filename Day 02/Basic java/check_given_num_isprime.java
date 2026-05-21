import java.util.Scanner;

public class check_given_num_isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        boolean isprime=true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }

        if(isprime==false){
            System.out.println(num+" is not prime number");
        }
        else{
            System.out.println(num+" is prime number");
        }
    }
}
