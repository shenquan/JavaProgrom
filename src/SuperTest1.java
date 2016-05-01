/**
 * Created by Administrator on 2016/4/23.
 */
class A {
    void fun1() {
        System.out.println("A");
    }

    void fun2() {
        fun1();
    }
    public static void main(String[] args) {
        SuperTest1 superTest1 = new SuperTest1();
        superTest1.fun2();//输出B

        A a = new A();
        a.fun2();//输出A
    }
}

public class SuperTest1 extends A {
    @Override
    void fun1() {
        System.out.println("B");
    }


}
