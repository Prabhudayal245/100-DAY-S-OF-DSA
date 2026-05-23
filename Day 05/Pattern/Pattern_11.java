// 1
// 01
// 101
// 0101
// 10101
import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        // outer loop
        int num=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                num=0;
            }
            else{
                num=1;
            }

            // inner loop
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=1-num;
            }
            System.out.println();
        }
    }
}
