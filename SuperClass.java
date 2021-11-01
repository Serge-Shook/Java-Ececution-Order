package execution_order;

public class SuperClass {

	static {
		Utils.print("First static block in SuperClass");
	}

	{
		Utils.print("First instance block in SuperClass");
	}

	public SuperClass() {
		Utils.print("Constructor in SuperClass");
	}

	{
		Utils.print("Second instance block in SuperClass");
	}

	static {
		Utils.print("Second static block in SuperClass");
	}
	
	public void method() {
		Utils.print("Method in SuperClass");
	}

}
