import static java.lang.Thread.sleep;

/**
 * Created by Administrator on 2016/4/17.
 */
public class TestThread {
    public static void main(String[] args) {


        new Father().start();
    }
}
class Father extends Thread{
    @Override
    public void run() {
        super.run();
        while(true){
            try {
                sleep(500);
                System.out.println("--runnable->"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
