package baoxin;

/**
 * cbbdc  aa
 * cd bc ac
 */
public class mianshi {
        public static void main(String[] args){
            int d =123;
            int m = 12;
            int c = 12;
            int n = 1; // 要求的n
            while(true) {
                if(n % 2 == 1 && n % 3 == 2 && n % 5 == 4 && n % 6 == 5 && n % 7 == 0 )
                    break;
                n++;
            }
            System.out.println("n = " + n);

    }
}
