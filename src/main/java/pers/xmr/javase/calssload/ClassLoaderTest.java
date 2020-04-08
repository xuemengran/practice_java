package pers.xmr.javase.calssload;

/**
 * @author xmr
 * @date 2019/2/28 10:48
 * @description java类的初始化顺序测试
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoaderSon classLoaderSon = new ClassLoaderSon();
    }
    static TestDemo testDemo = new TestDemo();
    TestDemo testDemo2 = new TestDemo(2);
    static {
        System.out.println("初始化父类静态代码块");
    }
    ClassLoaderTest(){
        System.out.println("初始化父类构造方法");
    }
    {
        System.out.println("初始化父类构造代码块");
    }
}

class ClassLoaderSon extends ClassLoaderTest
{
    static {
        System.out.println("初始化子类静态代码块");
    }
    static TestDemoSon testDemoSon = new TestDemoSon();
    TestDemoSon testDemoSon2 = new TestDemoSon(2);

    ClassLoaderSon()
    {
        System.out.println("初始化子类构造方法");
    }
    {
        System.out.println("初始化子类构造代码块");
    }

}

class TestDemo {
    TestDemo() {
        System.out.println("初始化父类静态变量");
    }
    TestDemo(int x)
    {
        System.out.println("初始化父类成员变量");
    }
}

class TestDemoSon {
    TestDemoSon()
    {
        System.out.println("初始化子类静态变量");
    }
    TestDemoSon(int x)
    {
        System.out.println("初始化子类成员变量");
    }
}
