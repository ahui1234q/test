package ExceptionText;

import com.sun.deploy.util.StringUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 检查异常
 *
 * 文件读取为例子
 */
public class Exception02 {
    public static void main(String[] args) {
        FileReader reader = null;
        System.out.println("step1");
        try {
            System.out.println("step2");
            reader = new FileReader("d:/a.txt");
            char a =(char)reader.read();
            System.out.println(a);
        } catch (FileNotFoundException e) {
            System.out.println("step3");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("step4");
            try {
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
