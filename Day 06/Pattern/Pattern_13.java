// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        // outer loop
        for(int i=1;i<=n;i++){
            int num=i;
            // inner loop
            // star
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            // space
            for(int sp=2*n;sp>2*i;sp--){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num--;
            }
            System.out.println("");
         
        }
    }
}
