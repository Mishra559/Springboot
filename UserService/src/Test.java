public class Test {
    public static void main(String[] args) throws Exception {
      Thread  t = new Thread(new Thread1());
      t.start();
       Thread.sleep(5000);

      Thread2 t2 = new Thread2();
      t2.start();
      Thread.sleep(5000);
    }
}
