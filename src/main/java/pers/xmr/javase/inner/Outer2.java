package pers.xmr.javase.inner;

/**
 * @author xmr
 * @date 2020/5/6 17:44
 * @description
 */
interface Inner2 {
    void show();
}

class Outer2 {
    //补齐代码
    public static Inner2 method() {
        return new Inner2() {
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

class OuterDemo {
    public static void main(String[] args) {
        Outer2.method().show();
    }
}