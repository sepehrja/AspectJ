
public privileged aspect CyclicProtocol {

	private final int MAX = 10;

	declare parents: Counter implements Cyclic;

	public void Counter.reset() {
		this.value = 0;
	}

	void around(Counter c): call(* Counter.increment()) && target(c) {
		if (c.value == MAX)
			c.reset();
		proceed(c);
	}

}
