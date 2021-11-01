package execution_order;

public class SubClass extends SuperClass {

	{
		Utils.print("First instance block in SubClass");
	}

	static {
		Utils.print("First static block in SubClass");
	}

	public SubClass() {
		Utils.print("Constructor in SubClass");
	}

	static {
		Utils.print("Second static block in SubClass");
	}

	{
		Utils.print("Second instance block in SubClass");
	}

	public void method() {
		Utils.print("Method in SubClass");
	}
}
