import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args) {

    Semaphore s = new Semaphore(1);
    Semaphore t = new Semaphore(0);
    //Semaphore v = new Semaphore(0);

    Processo1 p;
    Processo2 q;
    Processo3 r;

    try {
      p = new Processo1 (s,t/*,v*/);
      q = new Processo2 (s,t/*,v*/);
      r = new Processo3 (s,t/*,v*/);
     
     
      p.start();
      q.start();
      r.start();

      p.join();
      q.join();
      r.join();

    } catch(Exception e) {
      System.out.println("Deu erro!");
    }
  }
}