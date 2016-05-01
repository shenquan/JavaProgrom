/**
 * Created by Administrator on 2016/4/23.
 */

class AA{
    void fun1(){
        System.out.println("父类fun1");
    }
}

public class Jicheng extends AA{
    @Override
    void fun1() {
        super.fun1();
//        System.out.println("子类fun1");
    }

    public static void main(String[] args){
        Jicheng jicheng = new Jicheng();
        jicheng.fun1();

    }
}
