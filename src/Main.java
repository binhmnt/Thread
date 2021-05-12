//import java.util.ArrayList;
//import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*//Thread 1
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 10; i++){
                System.out.print("a ");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        //Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.print("b ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
        ArrayList<Integer> arrList = new ArrayList<>();

        //Rủi ro: chạy ngẫu nhiên có thể lỗi hoặc không
        //Thằng này chưa chạy xong thì thằng khác đã chạy
        //Chạy nhiều được nhưng Chạy đa luồng vừa tốn ram và cpu
        /*for (int i = 0; i < 10; i++){
            arrList.add(new Random().nextInt(10));
        }
        new Thread(()->{
            for (int i = 0; i < arrList.size(); i++){
                System.out.println(arrList.get(i) + " ");
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < arrList.size(); i++){
                System.out.println(arrList.get(i) + " ");
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 10; i++){
                try {
                    System.out.print("t1 ");
                    Thread.sleep(500);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();




        //join() sẽ ưu tiên thread này chạy cho hết mới chạy cái khác
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++){
                    try {
                        System.out.print("t1 ");
                        Thread.sleep(500);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

        try {
            t1.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 10; i++){
                    try {
                        System.out.print("t2 ");
                        Thread.sleep(500);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();
*/
/*
        //C1
        WorkingThread obj = new WorkingThread();
        obj.start();
        // C2 declare
        Working objRuna = new Working();
        //
        Thread obj1 = new Thread(objRuna);
        obj1.start();
        //C3
        new Thread(new Runnable() {
            @Override
            public void run() {
                //work
                for (int i = 0; i < 10; i++){
                    try {
                        System.out.print(i + " ");
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        //C4
        new Thread(()->{
            //work
            for (int i = 0; i < 10; i++){
                try {
                    System.out.print(i + " ");
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

 */
        //C5
        Student objStu = new Student();
        new Thread(()->{
            objStu.printPoint();
        }).start();
        new Thread(()->{
            objStu.printPoint();
        }).start();
        //t1 và t2 tác động vào obj
        //t1 và t2 chạy song song
        //t1 in ra "0" t2 in ra "0"
        //Tại 1 thời điểm chỉ 1 cái tác động vào obj gọi là Synchronized
    }
}
