// A
// AB
// ABC
// ABCD
// ABCDE
import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the value of n:");
        // int n=sc.nextInt();

        for(int i=1;i<=5;i++){
            char ch=65;
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
