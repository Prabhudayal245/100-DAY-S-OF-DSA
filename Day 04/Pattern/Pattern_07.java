//     *
//    ***
//   *****
//  *******
// *********

import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int n=sc.nextInt();
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop for printing space
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            // inner loop for printing star
            for(int st=1;st<=(2*i-1);st++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
