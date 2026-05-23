// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
import java.util.Scanner;

public class Pattern_10 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n=sc.nextInt();

    // outer loop for  part 1
    for(int i=1;i<=n;i++){
        // inner loop
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
// outer loop for part 2
    for(int i=1;i<=(n-1);i++){
        for(int j=(n-1);j>=i;j--){
            System.out.print("*");
        }
        System.out.println();
    }

   } 
}
