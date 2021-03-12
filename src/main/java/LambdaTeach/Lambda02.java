package LambdaTeach;

import entity.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 惰性求值与及早求值
 * 惰性求值：只描述Stream，操作的结果也是Stream，这样的操作称为惰性求值。
 * 惰性求值可以像建造者模式一样链式使用，最后再使用及早求值得到最终结果。
 * 及早求值：得到最终的结果而不是Stream，这样的操作称为及早求值。
 */
public class Lambda02 {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student("路飞", 22, 175),
                new Student("红发", 40, 180),
                new Student("白胡子", 50, 185)).collect(Collectors.toList());
        System.out.println(studentList);

        Stream stream = Stream.of("2","1","3");

        stream.forEach(System.out::println);

        /**
        * System.out::println这段代码其实就是Consumer<T>接口的一个实现方式啊
        */
       /* @Test
        public void testDemo2() {
            List<String> strList = Arrays.asList("YangHang", "AnXiaoHei", "LiuPengFei");

            strList.forEach(x -> {
                System.out.println(x);
            });

        }*/



    }
}
