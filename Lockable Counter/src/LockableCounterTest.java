
public class LockableCounterTest {

	public static void main(String[] args) {
		Counter lock1 = new LockableCounter();
		Lockable lock2 = new LockableCounter();
		System.out.println(lock1.getDescription());
		lock1.click();
		//lock2.click();
	}
}