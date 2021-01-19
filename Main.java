import calc.Calculator;



public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int addition = calc.add(1, 3);
		System.out.println(addition + " is the sum of the two numbers given");
		
		int subtraction = calc.diff(6, 2);
		System.out.println(subtraction + " is the difference of the two numbers given");
		
		int multiply = calc.multiply(7, 3);
		System.out.println(multiply + " is the product of the two numbers given");
		
		int division = calc.division(8, 4);
		System.out.println(division + " is the division of the two numbers given");
		/* Increment and Decrement */
		if (calc.increment() == 7) {
		System.out.println(calc.increment(7) + " is the increment of the number given");
		} else {
			System.out.println("Error In code...");
		System.out.println(calc.decrement(9) + " is the decrement of the number given");
	}
}