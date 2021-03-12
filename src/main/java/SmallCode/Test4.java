package SmallCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 插入排序
 */
public class Test4 {
    public static void main(String[] args) {
        int[] ins = {2, 3, 5, 1, 23, 6, 78, 34};
        int[] ins2 = sort2(ins);
        for (int in : ins2) {
            System.out.print(in+"\t");
        }
        System.out.println();
        System.out.println("排序后的数组："+ insertionSort(ins));
    }

    public static int[] sort(int[] ins) {
        for (int i = 1; i < ins.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ins[j] < ins[j - 1]) {
                    int temp = ins[j - 1];
                    ins[j - 1] = ins[j];
                    ins[j] = temp;
                }
            }
        }
        return ins;
    }

    public static int[] sort2(int[] ins) {
        for (int i = 1; i < ins.length; i++) {
            int temp = ins[i];//保存每次需要插入的那个数
            int j;
            for (j = i; j > 0 && ins[j - 1] > temp; j--) {//这个较上面有一定的优化
                ins[j] = ins[j - 1];//吧大于需要插入的数往后移动。最后不大于temp的数就空出来j
            }
            ins[j] = temp;//将需要插入的数放入这个位置
        }
        return ins;
    }

    public static String insertionSort(int[] arr) {
        //当前正在比较的数字（下方简称：“当前”）
        int current;
        for(int i=0; i<arr.length-1; i++) {
            current = arr[i + 1];
            //“当前”前面的数字的索引
            int preIndex = i;
            //找到比“当前”小的数字
            while(preIndex >= 0 && current < arr[preIndex]) {
                //向后移动已排好序的，大于“当前”的数字
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            //插入“当前”到相应的位置
            arr[preIndex+1] = current;
        }
        return Arrays.toString(arr);
    }
}
