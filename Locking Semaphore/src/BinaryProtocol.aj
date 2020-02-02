
public privileged aspect BinaryProtocol {

  pointcut monitoringIncs (Semaphore s): execution(* Semaphore.increment()) &&
    									this(s);
  pointcut monitoringDecs (Semaphore s): execution(* Semaphore.decrement()) &&
  										this(s);
  void around(Semaphore s): monitoringIncs(s) {
    if (s.value == 1)
      ;
    else
      proceed(s);
  }
  void around (Semaphore s): monitoringDecs(s) {
    if (s.value == 0)
      ;
    else
      proceed(s);
  }

}
