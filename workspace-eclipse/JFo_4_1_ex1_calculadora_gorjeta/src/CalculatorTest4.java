public class CalculatorTest4 {
	public static void main(String[] args) {

		Calculator4 calc = new Calculator4();

		//Use the Calculator object and arguments supplied to findTotal()
		//to print the total for each person
		System.out.println(
				calc.findTotal("Person 1", 10) 
				+ calc.findTotal("Person 2", 12)
				+ calc.findTotal("Person 3", 9)
				+ calc.findTotal("Person 4", 8)
				+ calc.findTotal("Person 5", 7)
				//+ calc.findTotal("Alex", 15)
				+ calc.findTotal("Person 7", 11)
				+ calc.findTotal("Person 8", 30)
				);

		/*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
		 */
	}    
}
