package SmallCode;

public class Test5 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j =5;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }



              System.out.println();
          }

    }
}
/**         等边三角形
 *       for(int i =1;i<=5;i++){
 *            for(int j = 5; j >= i ; j--) {
 *                System.out.print(" ");
 *            }
 *            for(int j =0;j<i;j++){
 *                System.out.print("*");
 *            }
 *            for(int j = 1; j < i; j ++) {//建立3号图形
 *                System.out.print("*");
 *            }
 *            System.out.println();
 *        }
 *
 *
 *
 *        平行四边形
 *         for(int i =1;i<=5;i++){
 *             for(int j =5;j>=i;j--){
 *                 System.out.print(" ");
 *             }
 *             for(int j =1;j<=i;j++){
 *                 System.out.print("*");
 *             }
 *             for(int j=5;j>=i;j--){
 *                 System.out.print("*");
 *             }
 *             System.out.println();
 *         }
 */