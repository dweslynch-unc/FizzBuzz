package code;

public class FizzBuzz {
	public static String fizzBuzz(int input) {
		if (input % 5 == 0)
		{
			if (input % 3 == 0)
				return "FizzBuzz";
			else
				return "Buzz";
		}
		else if (input % 3 == 0)
			return "Fizz";
		else return Ingeger.toString(input);
	}

	public static String fizzBuzz2(int input) {
		String output = "";
		
		if (input % 3 == 0)
			output += "Fizz";
		if (input % 5 == 0)
			output += "Buzz";
		if (input % 7 == 0)
			output += "Whoop";
		if (input % 4 == 0)
			output += "Wow";
		
		return (output.equals("")) ? String.valueOf(input) : output;
	}
}
