import java.util.Vector;
public class Stack {
 Vector<String> container = new Vector<String>();
 int index;
 public void push(String element) {
	 container.addElement(element);
  index++;
 }
 public Object pop() {
  return container.elementAt(index-1);
 }
}
