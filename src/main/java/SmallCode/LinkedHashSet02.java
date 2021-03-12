package SmallCode;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * new一个新的LinkedHashSet容器看一下具体的源码实现。
 * 跟进LinkedHashSet可以得到super一个父类初始化为一个容器为16大小，加载因子为0.75的Map容器。
 * 构造一个空连接散列集合
 *
 * 实际创建的是一个LinkedHashMap带有制定大小和加载因子的容器。
 *
 * 由于LinkedHashSet是一个哈希表和链表的结合，且是一个双向链表.
 *
 *
 *
 *
 */
public class LinkedHashSet02 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap;
         Set<String> set  = new LinkedHashSet<>();
        LinkedHashSet set1 = new LinkedHashSet();
        LinkedList<String> s;
        //跟进来走的是put的方法：LinkedHashSet.class下的，
        //这个是重写了超类中put的具k体add方法。
        // 他会在新分配的元素在链表的末尾插入一条
        set1.add("a");




    }
}
