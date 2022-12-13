import java.util.concurrent.Semaphore;

public class Processo3 extends Thread {

static Semaphore s, t/*, v*/;

  Processo3(Semaphore sem1, Semaphore sem2/*, Semaphore sem3*/) {
    s = sem1;
    t = sem2;
  //  v = sem3;
  }

  public void run() {

    try {
      while(true) {
        t.acquire();
        System.out.println("r");
        s.release();
        Thread.sleep(3000);
      }
    } catch(Exception e) {
      System.out.printf("r INTERRUPTED" + this.getName());
    }
  }
}