
public class Test {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore();
    semaphore.increment();
    semaphore.lock();
    semaphore.increment();
    System.out.println(semaphore.getValue());
    semaphore.unlock();
    semaphore.increment();
    semaphore.lock();
    semaphore.decrement();
    semaphore.unlock();
    semaphore.decrement();
    System.out.println(semaphore.getValue());
  }
}
