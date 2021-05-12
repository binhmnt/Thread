public class Student {
    public synchronized void printPoint(){
        for (int i = 0; i < 10; i++){
            try {
                System.out.println(i + " " + Thread.currentThread().getName());

                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
