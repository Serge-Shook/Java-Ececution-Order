package execution_order;

public class ExecutionOrderDemo {

	public static void main(String[] args) {

		System.out.println("  --== Creating instanceOne of SuperClass ==--");
		SuperClass instanceOne = new SuperClass();

		System.out.println("  --== Calling a method of instanceOne ==--");
		instanceOne.method();

		System.out.println("  --== Creating instanceTwo of SuperClass ==--");
		SuperClass instanceTwo = new SuperClass();

		System.out.println("  --== Calling a method of instanceTwo ==--");
		instanceTwo.method();
		
		
		System.out.println("  --== Creating instanceThree of SubClass ==--");
		SubClass instanceThree = new SubClass();

		System.out.println("  --== Calling a method of instanceThree ==--");
		instanceThree.method();

		System.out.println("  --== Creating instanceFour of SuperClass ==--");
		SubClass instanceFour = new SubClass();

		System.out.println("  --== Calling a method of instanceFour ==--");
		instanceFour.method();
		
		
		System.out.println("  --== Creating instanceFive of SubClass assigning to SuperClass type ==--");
		SuperClass instanceFive = new SubClass();

		System.out.println("  --== Calling a method of instanceFive ==--");
		instanceFive.method();

		System.out.println("  --== Creating instanceSix of SubClass assigning to SuperClass type ==--");
		SuperClass instanceSix = new SubClass();

		System.out.println("  --== Calling a method of instanceSix ==--");
		instanceSix.method();

	}

}
