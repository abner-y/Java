import java.util.concurrent.Semaphore;

public class Processo2 extends Thread {
  
static Semaphore s, t/*, v*/;

  Processo2(Semaphore sem1, Semaphore sem2/*, Semaphore sem3*/) {
    s = sem1;
    t = sem2;
  //  v = sem3;
  }

  public void run() {

    try {
      while(true) {
        s.acquire();
        System.out.println("q");
        t.release();
      Thread.sleep(3000);
      }
    } catch(Exception e) {
      System.out.printf("q INTERRUPTED" + this.getName());
    }
  }
}