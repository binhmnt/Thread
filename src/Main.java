public class Main {
    public static void main(String[] args) {
        //Thread 1
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
    }
}
