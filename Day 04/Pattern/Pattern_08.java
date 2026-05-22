// *********
//  *******
//   *****
//    ***
//     *
import java.util.Scanner;

public class Pattern_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop for printing space
            for(int sp=1;sp<=i-1;sp++){
                System.out.print(" ");
            }

            // inner loop for printing stars
            for(int st=9;st>=(2*i-1);st--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
