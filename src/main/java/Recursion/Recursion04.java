package Recursion;
//1*2*3*4*5*6*7*8*9*10
public class Recursion04 {
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d的阶乘为:%s%n",10,loop(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归耗时:%s%n",d2-d1);

        loop2(10);
    }
    static long loop(int n){
        if(n == 1){
            return 1;
        }else {
            return n*loop(n-1);
        }
    }

    static long loop2(int a){
        long result=1;
        long d3 = System.currentTimeMillis();
        while (a>1){
            result*=a*(a-1);//10*9 * 8*7 *  6*5 * 4*3 * 2*1
            a-=2;
        }
        long d4 = System.currentTimeMillis();
        System.out.printf("循环耗时：%s%n",d4-d3);
        System.out.println(result);
        return result;
    }
}
