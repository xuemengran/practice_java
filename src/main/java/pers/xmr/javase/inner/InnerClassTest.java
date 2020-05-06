package pers.xmr.javase.inner;

/**
 * @author xmr
 * @date 2020/4/24 15:16
 * @description 浅析内部类
 */
public class InnerClassTest {
    interface InnerService{
        void method();
    }

    private static String staticMember = "外部类静态变量";
    private String member = "外部类成员变量";
    private String sameNameMember = "外部类同名变量";
    private void test() {
        new InnerService() {
            @Override
            public void method() {
                System.out.println("匿名内部类! ");
            }
        }.method();
    }
    private static void staticMethod() {

        System.out.println("外部类静态成员方法");

        class LocalInner {
            // static String localStaticMember = "局部内部类静态变量"; // 编译报错
            public String localMember = "局部内部类成员变量";
            void visit() {
                System.out.println("局部内部类静态方法访问外部类静态成员: " + staticMember);
                // System.out.println("局部内部类访问外部类成员变量: " + member); // 编译报错
                System.out.println("局部内部类静态方法访问本类成员变量: " + localMember);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.visit();
        System.out.println("访问局部内部类成员变量: " + localInner.localMember);
    }


    private void ordinaryMethod() {
        System.out.println("外部类普通方法");
        class LocalInner {
            // static String localStaticMember = "局部内部类静态变量"; // 编译报错
            String localMember = "局部内部类变量";
            void visit() {
                System.out.println("局部内部类访问外部类静态成员: " + staticMember);
                System.out.println("局部内部类访问外部类成员变量: " + member);
                System.out.println("局部内部类静态方法访问本类变量: " + localMember);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.visit();
    }

    public static void main(String[] args) {
        /*
            创建静态内部类对象及操作静态内部类
         */
        InnerClassTest.StaticInner staticInner = new InnerClassTest.StaticInner();
        staticInner.visit();
        System.out.println("访问静态内部类静态变量: " + staticInner.innerStaticMember);
        System.out.println("访问静态内部类成员变量: " + staticInner.innerMember);

        /*
            创建成员内部类对象及操作成员内部类
         */

        Inner inner = new InnerClassTest().new Inner();
        inner.visit();
        System.out.println("访问成员内部类静态变量: " + inner.innerStaticMember);
        System.out.println("访问成员内部类成员变量: " + inner.innerMember);


    }
    /*
        内部类 : 将一个类定义在另一个类的内部,这就是内部类
        内部类本身是类的一个属性,与其它属性定义方式一致
     */
    /*
        内部类可分为 : 成员内部类,局部内部类,匿名内部类,静态内部类
     */

    static class StaticInner {
        private String innerStaticMember = "静态内部类静态变量";
        private String innerMember = "静态内部类成员变量";

        private void visit() {
            System.out.println("静态内部类访问外部类静态成员: " + staticMember); // ok
            System.out.println("静态内部类调用外部类静态方法: ");
            staticMethod();
            // 这里编译会报错
//            System.out.println("静态内部类访问外部类非静态成员: " + member);
//            System.out.println("静态内部类访问外部类非静态方法: " );
//            ordinaryMethod();
            InnerClassTest innerClassTest = new InnerClassTest();
            System.out.println(innerClassTest.member);
            innerClassTest.ordinaryMethod();
        }
    }

    class Inner {
        private String innerStaticMember = "成员内部类静态变量 ";
        private String innerMember = "成员内部类成员变量";
        String sameNameMember = "内部类同名变量";
        private void visit() {
            System.out.println("调用同名变量: " + sameNameMember);
            System.out.println("调用外部类同名变量: " + InnerClassTest.this.sameNameMember);
            System.out.println("成员内部类访问外部类静态成员: " + staticMember); // ok
            System.out.println("成员内部类调用外部类成员变量: " + member);
            System.out.println("成员内部类调用外部类静态方法: ");
            staticMethod();
            System.out.println("成员内部类调用外部类普通方法: ");
            ordinaryMethod();
        }
    }
}
