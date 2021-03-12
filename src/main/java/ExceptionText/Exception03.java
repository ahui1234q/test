package ExceptionText;

/**
 * 手动抛异常
 * person类
 * 异常类继承RuntimeException
 */
public class Exception03 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.setAge(10);
    }

}
class Person1{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IlleageException("年龄不合法");
        }
        this.age = age;
    }
}
class IlleageException extends RuntimeException{
    public IlleageException() {
    }

    public IlleageException(String message) {
        super(message);
    }
}