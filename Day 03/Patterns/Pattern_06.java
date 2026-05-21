// 12345
// 1234
// 123
// 12
// 1
public class Pattern_06 {
    public static void main(String[] args) {
        // outer loop
        for(int i=1;i<=5;i++){
            int num=1;
            // inner loop
            for(int j=5;j>=i;j--){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
