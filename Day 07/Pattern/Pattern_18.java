//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA
import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            char ch=65;
            // space
            for(int sp=n-1;sp>=i;sp--){
                System.out.print(" ");
            }
            // character
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(ch);

                if(j>=((2*i+1)/2)){
                    ch--;
                }
                else{
                    ch++;
                }
            }
            System.out.println("");
        }
    }
}
