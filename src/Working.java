public class Working implements  Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            try {
                System.out.print(i + " ");
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
