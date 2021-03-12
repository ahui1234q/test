package SmallCode;

import java.util.Scanner;

/**
 * 从键盘输入三个整数分别存入num1,num2,num3,对他们进行排序，并且从小到大输出
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的第一个整数:");
        int num1 = scan.nextInt();
        System.out.println("请输入你的第二个整数:");
        int num2 = scan.nextInt();
        System.out.println("请输入你的第三个整数:");
        int num3 = scan.nextInt();
        if(num1 <= num2){
            if(num3>=num2){
                System.out.println(num3+"\t"+num2+"\t"+num1);
            }
            else{
                if(num3<=num1){
                    System.out.println(num3+"\t"+num1+"\t"+num2);
                }
                else{
                    System.out.println(num1+"\t"+num3+"\t"+num2);
                }
            }
        }
        else{
            if(num3>=num1){
                System.out.println(num2+"\t"+num1+"\t"+num3);}
            else{
                if(num3>=2){
                    System.out.println(num2+"\t"+num3+"\t"+num1);
                }
                else{
                    System.out.println(num3+"\t"+num3+"\t"+num1);
                }
            }
        }
    }
}
