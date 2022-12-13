import java.util.concurrent.Semaphore;

public class Processo1 extends Thread {

 static Semaphore s, t/*, v*/;

  Processo1(Semaphore sem1, Semaphore sem2/*, Semaphore sem3*/) {
    s = sem1;
    t = sem2;
    //v = sem3;
  }

  public void run() {

    try {
      while(true) {
        s.acquire();
        System.out.println("p");
        t.release();
        Thread.sleep(3000);
      }
    } catch(Exception e) {
      System.out.printf("1 INTERRUPTED" + this.getName());
    }
  }
}