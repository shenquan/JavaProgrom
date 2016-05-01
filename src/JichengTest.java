/**
 * Created by Administrator on 2016/4/17.
 */
public class JichengTest {
    public static void main(String[] args) {
        Mother mother = new Mother("mother");
        Son son = new Son("son");
//        son.startup();
//        mother.start();
//        System.out.println(mother.name);
    }
}

class Mother extends Thread {
    String name;

    public Mother(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("mother");
    }
}

class Son extends Mother {
    String name;

    public Son(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }

    public void startup() {
        super.start();
    }
}
