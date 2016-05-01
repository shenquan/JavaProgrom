/**
 * Created by Administrator on 2016/4/23.
 */

class B1 {
    void fun1() {
        System.out.println("B1");
    }

    void fun2() {
        fun1();
    }

}

public class A1 extends B1 {
    //    @Override
    void fun1() {
        System.out.println("A1");
    }
    void fun2(){
        super.fun1();
    }


    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.fun2();
    }
}


