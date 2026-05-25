// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        // part 1
        for(int i=1;i<=n;i++){
            // star
            for(int st=n;st>=i;st--){
                System.out.print("*");
            }
            // space
            for(int sp=1;sp<=(2*i-2);sp++){
                System.out.print(" ");
            }
            // star
            for(int st=n;st>=i;st--){
                System.out.print("*");
            }
            System.out.println();
        }

        // part 2
        for(int i=1;i<=n;i++){
            // star
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            // space
            for(int sp=(2*n-2);sp>(2*i-2);sp--){
                System.out.print(" ");
            }
            // star
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        
            
         }
    }

