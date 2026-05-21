// 1
// 22
// 333
// 4444
// 55555
public class Pattern_04 {
    public static void main(String[] args) {
        // outer loop
        for(int i=1;i<=5;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
