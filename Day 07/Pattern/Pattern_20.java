// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the vlaue of n:");
        int n=sc.nextInt();

        // part1
        for(int i=1;i<=n;i++){
            // star
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            // space
            for(int sp=2*n-2;sp>(2*i-2);sp--){
                System.out.print(" ");
            }
            // star
            for(int st=1;st<=i;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        // part2
        for(int i=1;i<=n-1;i++){
            // star
            for(int st=n-1;st>=i;st--){
                System.out.print("*");
            }
            // space
            for(int sp=1;sp<=2*i;sp++){
                System.out.print(" ");
            }
            // star
            for(int st=n-1;st>=i;st--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
