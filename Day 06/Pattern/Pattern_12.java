// *      *
// **    **
// ***  ***
// ********
import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the vslue of n:");
        int n=sc.nextInt();
        // outer loop
        for(int i=1;i<=n;i++){
            // star
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            // space
            for(int sp=2*n;sp>2*i;sp--){
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
