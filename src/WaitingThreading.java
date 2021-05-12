import java.util.ArrayList;
import java.util.Random;

public class WaitingThreading {
    ArrayList<Integer> arrList = new ArrayList<>();

    public synchronized void add(){
        for (int i = 0; i < 10; i++){
            arrList.add(new Random().nextInt(10));
        }
        notify();//Đánh thức thread nào đang chờ
    }

    public synchronized void get(){
        if (arrList.size()<10){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 10; i++){
            System.out.println(arrList.get(i));
        }
    }
}
