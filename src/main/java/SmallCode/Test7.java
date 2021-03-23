package SmallCode;

public class Test7 {
    public static void main(String[] args) {
        Parent a = new Parent();
    }
}

class Parent {
    private int a = 2;

    public Parent() {
        System.out.println("Parent:" + a);
        show();
    }

    public void show() {
        System.out.println("a1:" + a);
    }
}

class Child extends Parent {
    int a = 3;

    public Child() {
        System.out.println("Child:" + a);
    }

    public void show() {
        System.out.println("a2:" + a);
    }
}
