package Variables;

class TypeOfVariables {
	public static void main(String[] args) {
		/*
			variables are containers

			Integer types:

				byte - 8 bits - 128 to 127
				short - 16 bits - 32,768 to 32,767
				int - 32 bits, 4 bytes - from -2 ^ 31 to 2 ^ 31 - 1
				long - 64 bits - from -2^63 to 2 ^ 63 - 1

			Character types:

				char
				String - which can store MANY CHARACTERS

			Floating numbers: 

				float - single precision  - 32 bits - 1.4 * 10 ^ -45 to 3.4 * 10 ^ 138
				double - double precision - 64 bits - 4.9 * 10 ^ -324 to 3.4 * 10 ^ 138
		 */
		
		int a = 10; 
		a = 15;
		long c = 1234567;
		short d = 12;
		double number1 = 124.44;
		float number2 = 124.44f;

		String firstName = "Darron"; 
		String lastName = "Brown";
		char character = 'A'; 


		System.out.println(a);
		System.out.println(firstName + " " + lastName);
	}
}