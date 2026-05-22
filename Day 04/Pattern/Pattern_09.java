//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
import java.util.Scanner;

public class Pattern_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        // outer loop for part1
        for(int i=1;i<=n;i++){
            // space
            for(int sp=1;sp<=(n-i);sp++){
                System.out.print(" ");
            }
            // star
            for(int st=1;st<=(2*i-1);st++){
                System.out.print("*");
            }
            System.out.println();
        }

        // outerloop for part2
        for(int i=1;i<=n;i++){
            // space
            for(int sp=1;sp<=(i-1);sp++){
                System.out.print(" ");
            }
            // star
            for(int st=9;st>=(2*i-1);st--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
