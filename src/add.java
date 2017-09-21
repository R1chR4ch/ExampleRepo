import java.util.Scanner;

public class add {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(System.getProperty("line.separator"));
		int x, y, z;
		double correct = 0;
		int tries = 0;
		System.out.println("Welcome! This is a practice quiz with 5 questions and would count towards your grade! Do well!");
		do {
			int answer;
			x = (int) (Math.random() * 101);
			y = (int) (Math.random() * 101);

			z = (int) (1 + Math.random() * 5);
			String o;

			if (z == 1) {
				answer = x + y;
				o = "What is " + x + " + " + y + " ?";
			} else if (z == 2) {
				answer = x - y;
				o = "What is " + x + " - " + y + " ?";
			} else if (z == 3) {
				x = (int) (1 + Math.random() * 20);
				y = (int) (1 + Math.random() * 20);
				
				answer = x * y;
				o = "What is " + x + " * " + y + " ?";
			} else {
				y = (int) (1 + Math.random() * 20);
				 
				x = x - (x % y);
				answer = x / y;
				o = "What is " + x + " / " + y + " ?";

			}

			int response = 0;
			boolean a = true;
			while (a) {
				System.out.println(o);
				String r = keyboard.next();
				try {
					response = Integer.parseInt(r);
					a = false;
				} catch (Exception e) {
					System.out.println("Your response is not applicable, sorry! Please try again.");
				}
			}

			

			if (answer == response) {
				System.out.println("Yay you got the answer correct! Next question.");
				correct++;
				tries++;
			} else {
				System.out.println("Wrong, your response wasn't correct, the answer was actually " + answer);
				tries++;
			}

		} while (correct < 5);
		String grade;
		if (correct / tries * 100 == 100) {
			grade = "You got a A+";
			
		}
		if (correct / tries * 100 == 100) {
			grade = "You got an A+!";
			
		}
		else if (correct / tries * 100 < 100 && correct / tries * 100 >= 80) {
			grade = "You got an A.";
			
		}
		else if (correct / tries * 100 < 80 && correct / tries * 100 >= 60) {
			grade = "You got a B.";
			
		}
		else if (correct / tries * 100 < 60 && correct / tries * 100 >= 40) {
			grade = "You got a C.";
			
		}
		else if (correct / tries * 100 < 40 && correct / tries * 100 >= 20) {
			grade = "You got a D.";
			
		}else{
			grade = "You failed the quiz :(";
			
		}
		System.out.println("Congratulations! You finished this short quiz with " + tries + " tries!");
		System.out.println("You finished this game an answer percentage of " + Math.round((correct / tries) * 100) + "%");
		System.out.println(grade);
	}

}
// end
