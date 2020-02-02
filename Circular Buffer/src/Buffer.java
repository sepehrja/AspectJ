public class Buffer {
  String[] BUFFER;
  int putPtr;
  int getPtr;
  int counter;
  int capacity;
  String name;
  Buffer (int capacity) {
    BUFFER = new String[capacity];
    this.capacity = capacity;
  }
  Buffer (int capacity, String name) {
    this(capacity);
    this.name = name;
  }
  public String getName() {
    return name;
  }
  private boolean isEmpty() {
    return (counter == 0);
  }
  private boolean isFull() {
    return (counter == capacity);
  }
  public void put (String s) {
    if (isFull())
      System.out.println("ERROR: Buffer full");
    else {
      BUFFER[putPtr++ % (capacity)] = s;
      counter++;
    }
  }
  public String get() {
    if (isEmpty())
      return "ERROR: Buffer empty";
    else {
      counter--;
      return BUFFER[getPtr++ % (capacity)];
    }
  }
}
