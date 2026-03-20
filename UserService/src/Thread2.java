public class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
